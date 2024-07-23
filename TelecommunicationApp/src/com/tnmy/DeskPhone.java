package com.tnmy;

public class DeskPhone implements Telephone {
    private String myNumber;
    private boolean isRinging;

    public DeskPhone(String myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Deskphone is always powered.");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing " +phoneNumber+ " on deskphone.");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the deskphone.");
        }else{
            System.out.println("The phone is not ringing.");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Phone ringing.");
        }else {
//            System.out.println("");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
