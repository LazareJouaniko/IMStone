package com.imstone.champion;

import com.imstone.deck.Deck;
import com.imstone.monster.Mascotte;
import com.imstone.monster.Monster;
import com.imstone.monster.Protecteur;

public class Archer extends Champion{

    public Archer(){
        super();
        d = new Deck();
        Monster m1 = new Mascotte();
        Monster m2 = new Protecteur();
        this.d.addMonster(m1);
        this.d.addMonster(m2);
    }

    @Override
    public void attackSpe() {

    } 
}