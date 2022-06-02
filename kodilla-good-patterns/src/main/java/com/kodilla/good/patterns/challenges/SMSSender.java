package com.kodilla.good.patterns.challenges;

public class SMSSender implements InformService {
    @Override
    public void informSeller(Seller seller, String address) {
        //send SMS - inform that product has been sold, send product by buyer's address
    }

    @Override
    public void informBuyer(Buyer buyer, boolean isSold) {
        if (isSold) {
            //send SMS - inform that he bought product
            System.out.println("product has been purchased");
        } else {
            //send SMS - inform that he did not buy
            System.out.println("product was not purchased");
        }
    }
}
