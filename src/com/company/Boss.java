package com.company;

abstract class Boss extends GameEntity implements IHavingSuperAbility{

    public Boss(int health, int damage, String TypeAbility) {
        super(health, damage, TypeAbility);
    }
}
