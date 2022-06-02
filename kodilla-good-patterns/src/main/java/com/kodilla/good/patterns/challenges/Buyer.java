package com.kodilla.good.patterns.challenges;

public class Buyer extends User{

    public Buyer(String firstName, String lastName, String phoneNumber, String address) {
        super(firstName, lastName, phoneNumber, address);
        this.isSeller = false;
    }
}
