package com.imstone;
import com.imstone.champion.Champion;
import com.imstone.utils.Select;

public class Main {
    public static void main(String[] args) {
        System.out.println("GROUPE -> Aymeric Beillon ; Lazare Jouaniko");
        Select s = new  Select();
        Champion c = s.Select_Champion();

        System.out.print(c);
    }
}