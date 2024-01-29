package com.imstone.monster;

public class Protecteur extends Monster {

    public Protecteur() {
        super();
        this.name = "Protecteur";
        this.attack = 0;
        this.defense = 200;
        this.health = 100;
    }

    @Override
    public int useskills() {
        // Des protecteurs empêchent les monstres adverses d’attaque le champion
        // directement ou d’autres monstres non protecteurs.
        return 0;

    }
}