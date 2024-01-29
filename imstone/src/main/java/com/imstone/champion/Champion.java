package com.imstone.champion;
import com.imstone.deck.Deck;
public abstract class Champion {
    int hp, id;
    String name;
    public abstract void attackSpe();
    Deck d ;
    
    public Deck getDeck(){
        return this.d;
    }
    public int getHp(){
        return this.hp;
    }

}

