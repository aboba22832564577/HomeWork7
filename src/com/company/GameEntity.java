package com.company;

public class GameEntity {
    protected int health, damage;
    protected String TypeAbility;

    public GameEntity(int health, int damage, String typeAbility) {
        this.health = health;
        this.damage = damage;
        TypeAbility = typeAbility;
    }

    public void damage(int damage){
        if (this.health - damage <= 0){
            this.health = 0;
        } else {
            this.health = this.health - damage;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeAbility() {
        return TypeAbility;
    }

    public void setTypeAbility(String typeAbility) {
        TypeAbility = typeAbility;
    }
}

