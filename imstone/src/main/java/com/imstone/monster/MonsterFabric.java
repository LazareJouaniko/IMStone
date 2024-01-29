package com.imstone.monster;

public class MonsterFabric {
    public Monster buildMonster(Type_Monster t){
        switch(t){
            case FANTASSIN :
            return new Fantassin();
            case MASCOTTE :
            return new Mascotte();
            case PROTECTEUR:
            return new Protecteur();
            case SOIGNEUR:
            return new Soigneur();
        }
        return null;
    }
}
