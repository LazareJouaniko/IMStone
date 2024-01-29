package com.imstone.champion;

import com.imstone.deck.Deck;
import com.imstone.monster.Fantassin;
import com.imstone.monster.Mascotte;
import com.imstone.monster.Monster;
import com.imstone.monster.Protecteur;
import com.imstone.monster.Soigneur;

public class Paladin extends Champion{
    public Paladin(){
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
        throw new UnsupportedOperationException("Unimplemented method 'attackSpe'");
    }
}
