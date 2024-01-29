
package com.imstone.monster;

public class Mascotte extends Monster {

    public Mascotte() {
        super();
        this.name = "Mascotte";
        this.attack = 200;
        this.defense = 200;
        this.health = 200;
        this.state = false;
    }


    @Override
    public int useskills() {
        // - Des mascottes, qui boostent une cible alliée ou ennemie
        return 0;
    }

}
