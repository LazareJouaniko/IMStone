package com.imstone.champion;
import com.imstone.deck.Deck;
public abstract class Champion {
    int hp, id;
    String name;
    int mana;
    public abstract void attackSpe();
    Deck d ;
    
    public Deck getDeck(){
        return this.d;
    }
    public int getHp(){
        return this.hp;
    }
    public void setHp(int hp){
         this.hp = hp;

    }
    public int getMana(){
        return this.mana;
    }
    public void setMana(int mana){
        this.mana = mana;
    }

}

