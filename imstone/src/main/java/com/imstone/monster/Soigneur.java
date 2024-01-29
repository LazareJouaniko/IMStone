
package com.imstone.monster;

public class Soigneur extends Monster {

    public Soigneur() {
        super();
        this.name = "Soigneur";
        this.attack = 0;
        this.defense = 0;
        this.health = 100;

    }

    public int useskills() {
        System.out.println("Le soigneurs soigne un champion de 100 points de vie");
        return this.health;
    }
}
