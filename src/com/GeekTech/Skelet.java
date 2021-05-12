package com.GeekTech;

public class Skelet extends Boss {
    private int numberOfArrows;

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    @Override
    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    private Weapon weapon;



    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public Skelet(int health, int damage, int numberOfArrows) {
        super(health, damage);
        this.numberOfArrows = numberOfArrows;
    }

    public Skelet(int health, int damage) {
        super(health, damage);
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " Количество стрел: " + getNumberOfArrows();
    }
}
