package com.imstone.utils;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.imstone.champion.Champion;
import com.imstone.champion.FabricChampion;
import com.imstone.monster.Fantassin;
import com.imstone.monster.Mascotte;
import com.imstone.monster.Monster;
import com.imstone.monster.Protecteur;
import com.imstone.monster.Soigneur;
import com.imstone.player.Player;
public class Utils{

public void play_Round(Player p1,Player p2){
        //parcourir le terrain allié
        //tirer carte 
        System.out.println(p1.getName()+" tire une carte");
        p1.addToHand(p1.draw_Card());
        //propose de jouer une carte dans sa main
        System.out.println(p1.getName()+ "joue une carte dans sa main");
        printCard(p1.getHand());
        //action poser carte 
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        p1.addToBoard(p1.getHand().get(index));
        p1.getHand().remove(index);

        //Afficher Board 
        play_onBoard(p1,p2);
    
    }

public void first_Hand(Player p,int hand_size){
    for (int i = 0; i<hand_size; i++){
        Random random = new Random();
        int index = random.nextInt(p.getChampion().getDeck().getCard().size());
        p.addToHand(p.getChampion().getDeck().getCard().get(index));
    }
}

public  int printCard(List <Monster> l){
    if (l.size() ==0){
        System.out.println("Pas de carte sur le terrain");
        return 1;
    }
    for (int i = 0; i < l.size(); i++){
        //to String avec id id carte 
        System.out.println(i+" - "+l.get(i));
    }
    return 0;
}

public  Champion Select_Champion(){
        Scanner sc = new Scanner(System.in);
        FabricChampion f = new FabricChampion();
        Champion c = null;

        while (c == null){
           System.out.println("(1)-Archer\n(2)-Paladin\n(3)-Voleur\n(4)-Chevalier\n");
           String in = sc.next();
           c = f.createChampion(in);
        }
        return c;
   }
   
public  String Select_PlayerName(){
    System.out.println("Selectionner votre nom de joueur");
    String s =null;
    Scanner sc = new Scanner(System.in);

    while (s == null){
       s = sc.next();
    }
    return s;
   }

   //verifie que tout le board d'un joueur est en statut "joué"
public static Boolean checkState(Player p){
    for (int i =0; i< p.getBoard().size(); i++){
        if(p.getBoard().get(i).getState() == false){
            return false;
    }
}
return true;
}

public  void play_onBoard(Player p1, Player p2){
    while (checkState(p1) == false){
    System.out.println("Selectionner une carte avec laquelle intéragir");
    printCard(p1.getBoard());
    Scanner sc = new Scanner(System.in);
    int index = sc.nextInt();
    Card_Action(p1.getBoard().get(index),p1,p2);
    }
}

public  void attack(Monster m1, Monster m2){
    m2.setHp(m2.getHp()-m1.getAttack());
}
public  void heal(Monster m1, Monster m2){
    m2.setHp(m2.getHp()+m1.getAttack());
    }


public boolean checkProtecteur(Player p){
    for (int i =0; i < p.getBoard().size();i++){
        if(p.getBoard().get(i) instanceof Protecteur){
            return true;
        }
    }
    return false;
}
public void resetState(Player p){
for (int i = 0; i<p.getBoard().size();i++){
    p.getBoard().get(i).setState(false);
}
}

public void Card_Action(Monster m,Player p1, Player p2){
if (m instanceof Fantassin){
    actionFantassin(m, p1, p2);
}
if (m instanceof Mascotte){
    actionMascotte(m, p1, p2);
}
if (m instanceof Protecteur){
    actionProtecteur();
    m.setState(true);
}
if (m instanceof Soigneur){
    actionSoigneur(m, p1, p2);
   }   
}

public void actionFantassin(Monster m,Player p1, Player p2){
//si en face protecteur forcer l'attaque sinon selectionner champion ou carte. 
Scanner sc = new Scanner(System.in);
int scan;
if(p2.getBoard().size() == 0){
    System.out.println(m.getName()+" attaque "+p2.getName());
    p2.getChampion().setHp(p2.getChampion().getHp());
    m.setState(true);
}
//si protecteur forcé de l'attaquer
if(checkProtecteur(p2) == true){
    System.out.println("Le protecteur adverse défend !");
    //afficher les cartes de l'adversaire
    printCard(p2.getBoard());
    //tant que le monstre n'a pas effectué d'action boucler
    while(m.getState() == false){
        scan = sc.nextInt();
        if(p2.getBoard().get(scan) instanceof Protecteur){
            attack(m, p2.getBoard().get(scan));
            m.setState(true);
        }else{
            System.out.println("Action Impossible ciblez un protecteur !");
        }
    }
        //Si au moins un ennemie sur le terrain 
    }else if(p2.getBoard().size()>0){
        System.out.println("0 - Attaquer Monstre\n1 - Attaquer Champion");
        scan = sc.nextInt();
        if(scan == 1){
                System.out.print(m.getName()+" attaque "+p2.getName());
                p2.getChampion().setHp(p2.getChampion().getHp());
                m.setState(true);
            //attaquer champion
          
           
            //attaquer monstre
        }if(scan == 0){
            System.out.println("Quel monstre attaquer ?");
            printCard(p2.getBoard());
            scan = sc.nextInt();
            
            attack(m, p2.getBoard().get(scan));
            System.out.println(m.getName()+" attaque "+p2.getBoard().get(scan));
            m.setState(true);
        }

        }

    }

public void actionMascotte(Monster m, Player p1, Player p2){
    Scanner sc = new Scanner(System.in);
    System.out.println("Qui voulez-vous booster ? \n 0 - Alliés\n 1 - Ennemies");
    int scan = sc.nextInt();
    if(scan == 0){
        System.out.print("Qui voulez-vous booster ?");
        printCard(p1.getBoard());
        scan = sc.nextInt();
        System.out.println("La mascotte danse !\nLes dégats de"+p1.getBoard().get(scan)+" augmentent ");
        p1.getBoard().get(scan).setAttack(p1.getBoard().get(scan).getAttack()*2);
        m.setState(true);
    }
    else if(scan == 1){
        System.out.print("Qui voulez-vous booster ?");
        printCard(p2.getBoard());
        scan = sc.nextInt();
        System.out.println("La mascotte danse !\nLes dégats de"+p2.getBoard().get(scan)+" augmentent ");
        p2.getBoard().get(scan).setAttack(p2.getBoard().get(scan).getAttack()*2);
        m.setState(true);
    }

}

public void actionProtecteur(){
    System.out.println("Le protecteur défend");
}
public void actionSoigneur(Monster m, Player p1, Player p2){
    Scanner sc = new Scanner(System.in);
    System.out.println("Qui voulez-vous soigner ? \n 0 - Alliés\n 1 - Ennemies");
    int scan = sc.nextInt();
    if(scan == 0){
        System.out.print("Qui voulez-vous soigner ?");
        printCard(p1.getBoard());
        scan = sc.nextInt();
        System.out.println("Les pv de"+p1.getBoard().get(scan)+" sont restaurés ");
        p1.getBoard().get(scan).setAttack(p1.getBoard().get(scan).getAttack()*2);
        m.setState(true);
    }
    else if(scan == 1){
        System.out.print("Qui voulez-vous soigner ?");
        printCard(p2.getBoard());
        scan = sc.nextInt();
        System.out.println("Les pv de"+p2.getBoard().get(scan)+" sont restaurés ");
        p2.getBoard().get(scan).setAttack(p2.getBoard().get(scan).getAttack()*2);
        m.setState(true);
    }
}

}

