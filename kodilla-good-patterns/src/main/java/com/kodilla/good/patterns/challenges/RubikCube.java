package com.kodilla.good.patterns.challenges;

public class RubikCube implements ProductRepository {
    private boolean isAvailable;
    private String name;
    private double price;

    public RubikCube(String name, double price) {
        this.isAvailable = true;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String getProductName() {
        return name;
    }

    @Override
    public void sold() {
    isAvailable = false;
    }

    @Override
    public double getSellPrice() {
        return price;
    }
}