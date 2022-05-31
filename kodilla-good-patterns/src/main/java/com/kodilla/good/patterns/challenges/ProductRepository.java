package com.kodilla.good.patterns.challenges;

public interface ProductRepository {

    boolean isAvailable();

    String getProductName();

    void sold();

    double getSellPrice();
}
