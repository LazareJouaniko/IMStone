package com.imstone.plato;
import java.util.Scanner;

import com.imstone.champion.Champion;
import com.imstone.champion.FabricChampion;
import com.imstone.monster.*;
import com.imstone.player.Player;
import com.imstone.utils.Utils;
public class Plato {

    Player p1;
    Player p2;

    
   public Plato(){

        //Champ select 
        System.out.println("Selectionner Champion 1");
        p1 = new Player(Select_Champion(), Select_PlayerName());
        p2  = new Player(Select_Champion(), Select_PlayerName());
       first_Hand(p1, 2);
       first_Hand(p2, 2);
       play_Round(p1, p2);

        
    }

    public Champion Select_Champion(){
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
    
   public String Select_PlayerName(){
    System.out.println("Selectionner votre nom de joueur");
    String s =null;
    Scanner sc = new Scanner(System.in);

    while (s == null){
       s = sc.next();
    }
    return s;
   }

   public void first_Hand(Player p,int hand_size){
    for (int i = 0; i<hand_size; i++){
        p.addToHand(p.getChampion().getDeck().getCard().get(i));
    }
    
    
}

public void play_onBoard(Player p){
    while (checkState(p) == false){
    System.out.println("Selectionner une carte avec laquelle intéragir");
    Utils.printCard(p.getBoard());
    Scanner sc = new Scanner(System.in);
    int index = sc.nextInt();
    Card_Action(p1.getBoard().get(index));
    }
}

public void play_Round(Player p1,Player p2){
    //parcourir le terrain allié
    //tirer carte 
    System.out.println(p1.getName()+" tire une carte");
    p1.addToHand(p1.draw_Card());
    //propose de jouer une carte dans sa main
    System.out.println(p1.getName()+ "joue une carte dans sa main");
    Utils.printCard(p1.getHand());
    //action poser carte 
    Scanner sc = new Scanner(System.in);
    int index = (int) sc.nextInt();
    p1.addToBoard(p1.getHand().get(index));
    //Afficher Board 
    play_onBoard(p1);

}
public void Card_Action(Monster m){
    if(m.getState()== true){
        System.out.println("Le monstre a déjà attaqué");
    }else {
        if (m instanceof Mascotte){
            System.out.println("la mascotte à jouer");
    }
        if (m instanceof Protecteur){
        //System.out.print()
}
    
    }
}
   

public Boolean checkState(Player p){
    for (int i =0; i< p.getBoard().size(); i++){
        if(p.getBoard().get(i).getState() == false){
            return false;
    }
}
return true;
}

}