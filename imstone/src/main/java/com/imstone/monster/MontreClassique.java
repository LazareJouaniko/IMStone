package com.imstone.monster;

public class MontreClassique extends Monster {

    public MontreClassique() {
        super();
        this.name = "MontreClassique";
        this.attack = 100;
        this.defense = 100;
        this.health = 0;
    }

    public int useskills() {
        return this.attack;
    }

}
