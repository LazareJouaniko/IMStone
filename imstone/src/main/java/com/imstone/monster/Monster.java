package com.imstone.monster;


public abstract class Monster {
    int id, hp;
    String name;
    int attack;
    int defense;
    int health;
    boolean state ;

    public abstract int useskills();

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

    public void getDefense(int defense) {
        this.defense = defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
    public boolean getState(){
        return this.state;
    }
    public void setState(Boolean state){
        this.state = state;
    }
    //
    //public toString(){
   //     System.out.print(this.name)
    //}
}
