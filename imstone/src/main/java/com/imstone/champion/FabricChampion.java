package com.imstone.champion;
public class FabricChampion{

    public Champion createChampion(String c){
        switch(c){
            case "1" : 
            return new Archer();
            case "2" :
            return new Paladin();
            case "3" :
            return new Voleur();
            case "4" :
            return new Chevalier();
        }
        return null;
    }


}