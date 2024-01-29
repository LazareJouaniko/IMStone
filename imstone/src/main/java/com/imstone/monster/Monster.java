package com.imstone.monster;


public abstract class Monster {
    int id, hp;
    String name;
    int attack;
    boolean state ;

    public String getName(){
        return this .name;
    }
   
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getId() {
        return id;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }


    public boolean getState(){
        return this.state;
    }
    public void setState(Boolean state){
        this.state = state;
    }
    //
    @Override
    public String toString(){
       String str = this.getName()+" PV : "+this.getHp()+" ATTACK :"+this.getAttack();
       return str;
    }
}
