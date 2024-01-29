package com.imstone.champion;

import com.imstone.deck.Deck;
import com.imstone.monster.*;


public class Chevalier extends Champion{
    public Chevalier(){
        super();
        d = new Deck();
        Monster m1 = new Mascotte();
        Monster m2 = new Protecteur();
        Monster m3 = new Soigneur();
        Monster m4 = new Fantassin();
        this.d.addMonster(m1);
        this.d.addMonster(m2);
        this.d.addMonster(m3);
        this.d.addMonster(m4);
    }

    @Override
    public void attackSpe() {
     
    }
}
