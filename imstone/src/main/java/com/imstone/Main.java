package com.imstone;
import com.imstone.deck.Deck;
import com.imstone.monster.Monster;

public class Main {
    public static void main(String[] args) {
        System.out.println("GROUPE -> Aymeric Beillon ; Lazare Jouaniko");
        Deck d = new Deck();
        Monster m = new Monster();
        Monster m2 = new Monster();
        d.addMonster(m2).addMonster(m2);
        System.out.print(d.getDeck());
    }
}