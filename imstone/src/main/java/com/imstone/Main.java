package com.imstone;
<<<<<<< HEAD
import com.imstone.champion.Champion;
import com.imstone.utils.Select;
=======
import com.imstone.deck.Deck;
import com.imstone.monster.Monster;
>>>>>>> a5aaa0b81407567c85743e0afd033b016783fedf

public class Main {
    public static void main(String[] args) {
        System.out.println("GROUPE -> Aymeric Beillon ; Lazare Jouaniko");
<<<<<<< HEAD
        Select s = new  Select();
        Champion c = s.Select_Champion();

        System.out.print(c);
=======
        Deck d = new Deck();
        Monster m = new Monster();
        Monster m2 = new Monster();
        d.addMonster(m2).addMonster(m2);
        System.out.print(d.getDeck());
>>>>>>> a5aaa0b81407567c85743e0afd033b016783fedf
    }
}