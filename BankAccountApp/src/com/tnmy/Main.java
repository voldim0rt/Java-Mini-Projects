package com.tnmy;

import javax.accessibility.AccessibleContext;

public class Main {
    public static void main(String[] args) {


        Account TanmayAccount = new Account("12355", 0.0, "Tanmay", "tanmay@gmail.com", "3223321");
        TanmayAccount.depositMoney(100);
        TanmayAccount.depositMoney(500);
        TanmayAccount.withDrawMoney(200);
        TanmayAccount.withDrawMoney(400);
    }
}