package com.kodilla.good.patterns.challenges;

public class BuyerSellerList implements UserRepository{

    Seller seller = new Seller("Marian", "Zenon", "500432234", "ul. Katowicka 2/3 Warszawa");
    Buyer buyer = new Buyer("Janusz", "Kowalski", "500234567", "ul. Warszawska 3/2  Katowice");

    @Override
    public Buyer getBuyer() {
        return buyer;
    }

    @Override
    public Seller getSeller() {
        return seller;
    }
}
