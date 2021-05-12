package com.GeekTech;

public class Boss extends GameEntity {

    public Boss(int health, int damage) {
        super(health, damage);

    }

    public String printInfo(){
        return "Здоровье : " + getHealth() + " Урон :  " + getDamage() +
                " Оружие: " + getWeapon().getNameOfWeapon() + " Тип оружия: "
                + getWeapon().getTypeOfWeapon();
    }

    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }



}
