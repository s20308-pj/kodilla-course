package com.kodilla.good.patterns.challenges;

public interface InformService {

    void informSeller(Seller seller, String address);
    void informBuyer(Buyer buyer, boolean isSold);
}
