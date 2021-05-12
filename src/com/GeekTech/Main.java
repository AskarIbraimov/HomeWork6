package com.GeekTech;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Boss firstBoss = new Boss(100,25);
        Weapon axe = new Weapon("Slashing weapon","Axe");
        firstBoss.setWeapon(axe);
        System.out.println(firstBoss.printInfo() + " Статистика Босса ");


        Skelet skeletonKing = new Skelet(201,48,69);
        Weapon bow = new Weapon("Small arm","Bow");
        skeletonKing.setWeapon(bow);
        Skelet kingSkeleton = new Skelet(102,84,96);
        Weapon xBow = new Weapon("Small arm","X Bow");
        kingSkeleton.setWeapon(xBow);



        System.out.println(skeletonKing.printInfo() + " Статистика Короля Скелетов");
        System.out.println(kingSkeleton.printInfo() + " Статистика Короля Скелета");

//        System.out.println(firstBoss.getWeapon().getTypeOfWeapon() + " "+ firstBoss.getWeapon().getNameOfWeapon()
//                + " " + firstBoss.getHealth() + " " + firstBoss.getDamage());
    }


}
