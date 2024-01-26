package com.imstone.utils;

import java.util.Scanner;

import com.imstone.champion.Champion;
import com.imstone.champion.FabricChampion;

public class Select{
    public Champion Select_Champion(){
         Scanner sc = new Scanner(System.in);
         FabricChampion f = new FabricChampion();
         Champion c = null;
         while (c == null){
            System.out.print("Selectionner un Champion :\n(1)-Archer\n(2)-Paladin\n(3)-Voleur\n(4)-Chevalier\n");
            String in = sc.nextLine();
            c = f.createChampion(in);
         }
         sc.close();
         return c;
    }
}
