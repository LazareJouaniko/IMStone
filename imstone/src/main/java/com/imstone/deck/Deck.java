package com.imstone.deck;
import java.util.ArrayList;
import java.util.List;
import com.imstone.monster.Monster;

public class Deck {
    private int  MAX_MONSTER_IN_DECK = 10;
    private List <Monster> l;

    public Deck(){
        //log deck créé
        this.l = new ArrayList<Monster>();
    }

    public List <Monster>  getDeck(){
        return this.l;
    }

public Deck addMonster(Monster m){
    if(this.l.size() > MAX_MONSTER_IN_DECK){
        //log deck déjà complet
    }else{
        //log
        this.l.add(m);
    }
    return this;
}

public Deck removeMonster(Monster m){
    if(this.l.size() > 0){
        this.l.remove(m);
}
return this;
}

public Deck removeAllMonsters(){
    while (this.l.size()>0){
        this.l.remove(0);
    }
return this;
}
}