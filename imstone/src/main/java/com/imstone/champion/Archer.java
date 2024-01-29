package com.imstone.champion;

import com.imstone.deck.Deck;
import com.imstone.monster.*;

public class Archer extends Champion{

    public Archer(){
        super();
        d = new Deck();
        this.hp = 100;
        Monster m1 = new Fantassin();
        Monster m2 = new Mascotte();
        Monster m3 = new Protecteur();
        Monster m4 = new Soigneur();
        this.d.addMonster(m1);
        this.d.addMonster(m2);
        this.d.addMonster(m3);
        this.d.addMonster(m4);
    }

    @Override
    public void attackSpe() {

    } 
}