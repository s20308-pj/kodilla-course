package com.kodilla.good.patterns.challenges;

public class BuyRequest {

    private final double offeredPrice;

    public BuyRequest(double offeredPrice) {
        this.offeredPrice = offeredPrice;
    }

    public double getOfferedPrice() {
        return offeredPrice;
    }
}
