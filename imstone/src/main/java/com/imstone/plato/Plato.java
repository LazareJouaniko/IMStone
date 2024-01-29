package com.imstone.plato;
import java.util.Scanner;

import com.imstone.champion.Champion;
import com.imstone.champion.FabricChampion;
import com.imstone.monster.*;
import com.imstone.player.Player;
import java.util.Random;
import com.imstone.utils.Utils;
public class Plato {

    Player p1;
    Player p2;
    Utils game_manager = new Utils();
    
   public Plato(){

    System.out.println("Selectionner Champion 1");
    p1 = new Player(game_manager.Select_Champion(), game_manager.Select_PlayerName());
    System.out.println("Selectionner Champion 2");
    p2  = new Player(game_manager.Select_Champion(), game_manager.Select_PlayerName());
    game_manager.first_Hand(p1, 2);
    game_manager.first_Hand(p2, 2);
    //tant que jeux pas finis ... 
    while(p1.getChampion().getHp() > 0 || p2.getChampion().getHp() > 0){
        
        game_manager.play_Round(p1, p2);
        game_manager.play_Round(p2, p1);
        game_manager.resetState(p1);
        game_manager.resetState(p2);
    }

        
    }

}



