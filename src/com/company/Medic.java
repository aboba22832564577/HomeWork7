package com.company;

public class Medic extends Hero{

    public Medic(int health, int damage, String TypeAbility) {
        super(health, damage, TypeAbility);
    }

    @Override
    public String applySuperAbility(Hero[] hero) {
        System.out.println("применил супер способность Critical Damage");
        return null;
    }
}
