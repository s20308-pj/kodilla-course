package com.kodilla.good.patterns.challenges;

public class Main {
    public static void main(String[] args) {
//        MovieStore movieStore = new MovieStore();
//
//        movieStore.getMovies().values().forEach(
//                translation -> translation.forEach(title -> System.out.print(title + "! ")));

        ProductRepository product = new RubikCube("3x3", 25);
        UserRepository users = new BuyerSellerList();
        InformService inform = new SendSMS();
        BuyService buy = new BuyAuction();

        ProductOrderService productOrderService = new ProductOrderService(product,users, inform, buy);
        productOrderService.processes(new BuyRequest(24));


    }
}
