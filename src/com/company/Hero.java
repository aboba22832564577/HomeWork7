package com.company;

abstract class Hero extends GameEntity implements IHavingSuperAbility {

    public Hero(int health, int damage, String TypeAbility) {
        super(health, damage, TypeAbility);
    }
}
