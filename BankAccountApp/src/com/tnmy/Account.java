package com.tnmy;

public class Account {
    private String Number;
    private double Balance;
    private String Name;
    private String Email;
    private String PhoneNumber;

    public Account(String Number, double Balance, String Name, String Email, String PhoneNumber) {
        this.Number = Number;
        this.Balance = Balance;
        this.Name = Name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }

    public void depositMoney(double depositedMoney){
        this.Balance += depositedMoney;
        System.out.println("Deposit is succesful. New balance is " +this.Balance);
    }

    public void withDrawMoney(double withdrawalMoney){
        if(this.Balance - withdrawalMoney < 0){
            System.out.println("Withdrawal unsuccessful. Only "+this.Balance+ " is left.");
        }else {
            this.Balance-= withdrawalMoney;
            System.out.println("Withdraw successful. Current balance is " +this.Balance);
        }
    }


    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
