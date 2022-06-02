package com.kodilla.good.patterns.challenges;

public class Main {
    public static void main(String[] args) {
//        MovieStore movieStore = new MovieStore();
//
//        movieStore.getMovies().values().forEach(
//                translation -> translation.forEach(title -> System.out.print(title + "! ")));

        ProductInterface product = new RubikCube("3x3", 25);
        UserRepository users = new BuyerSellerList();
        InformService inform = new SMSSender();
        BuyService buy = new BuyAuction();

        ProductOrderService productOrderService = new ProductOrderService(product,users, inform, buy);
        productOrderService.processes(new BuyRequest(26));


    }
}
