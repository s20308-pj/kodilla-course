package com.kodilla.good.patterns.challenges;

public class Seller extends User {

    public Seller(String firstName, String lastName, String phoneNumber, String address) {
        super(firstName, lastName, phoneNumber, address);
        this.isSeller = true;
    }
}
