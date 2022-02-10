package com.company;

public class Magic extends Hero{

    public Magic(int health, int damage, String TypeAbility) {
        super(health, damage, TypeAbility);
    }

    @Override
    public String applySuperAbility(Hero[] hero) {
        System.out.println("применил суперспособность Critical Damage");
        return null;
    }
}
