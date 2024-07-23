package com.tnmy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        DeskPhone myPhone = new DeskPhone("4292319123");
//        myPhone.powerOn();
//        myPhone.callPhone("4292319123");
//        myPhone.answer();

        MobilePhone myPhone = new MobilePhone("439043234");
        myPhone.powerOn();  //--> Either a wrong number entered or phone is off.
        myPhone.callPhone("439043234");
        myPhone.answer();
    }
}