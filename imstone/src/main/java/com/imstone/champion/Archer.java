package com.imstone.champion;

import com.imstone.deck.Deck;
import com.imstone.monster.Monster;

public class Archer extends Champion{

    public Archer(){
        super();
        d = new Deck();
        Monster m1 = new Monster();
        Monster m2 = new Monster();
        this.d.addMonster(m1);
        this.d.addMonster(m2);
    }

    @Override
    public void attackSpe() {

    } 
}