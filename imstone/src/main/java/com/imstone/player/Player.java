package com.imstone.player;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.imstone.champion.Champion;
import com.imstone.monster.*;


public class Player{
    Champion champion;
    String name; 
    List <Monster> hand;
    List <Monster> board;
    
    public Player(Champion c , String name){
        this.champion = c;
        this.name = name;
        this.hand = new ArrayList<Monster>();
        this.board =  new ArrayList<Monster>();
    }
    public List<Monster> getHand(){
        return this.hand;
    }
    public List<Monster> getBoard(){
        return this.board;
    }

    public Champion getChampion(){
        return this.champion;
    }
    public void addToHand(Monster m){
        this.hand.add(m);
    }

    public void addToBoard(Monster m){
        this.board.add(m);
    }
    public void removeFromBoard(Monster m){
        this.hand.remove(m);
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
  
    public void setChampion(Champion c){
        this.champion = c;
    }
    public Monster draw_Card(){

        //tirer carte, mettre aléatoire 
        Random r = new Random();
        int index = r.nextInt(this.champion.getDeck().getCard().size());
        return this.champion.getDeck().getCard().get(index);
    }
}