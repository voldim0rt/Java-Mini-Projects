package com.tnmy;

public interface Telephone {
    //powerOn
    //dial a number
    //answer the call
    //call another phone
    //is ringing

    void powerOn();
    void dial(String phoneNumber);
    void answer();
    boolean callPhone(String phoneNumber);
    boolean isRinging();
}
