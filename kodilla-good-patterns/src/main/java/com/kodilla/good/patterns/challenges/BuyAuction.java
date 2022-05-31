package com.kodilla.good.patterns.challenges;

public class BuyAuction implements BuyService {
    @Override
    public boolean sell(double sellPrice, double offeredPrice) {
        System.out.println("seller:" + sellPrice + "\noffered:"+ offeredPrice);
        if (sellPrice <= offeredPrice) {
            return true;
        } else {
            return false;
        }
    }
}
