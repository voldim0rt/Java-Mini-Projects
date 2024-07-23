package com.tnmy;

public class Main{
    public static void main(String[] args) {
        Player1 player = new Player1("Tanmay", "Sword", 100);

//        System.out.println(player.getName());
//        System.out.println(player.getWeapon());
//        System.out.println(player.getHealth());
        player.damagedByGun1();
        player.damagedByGun1();
        player.damagedByGun2();
        player.heal();
    }
}