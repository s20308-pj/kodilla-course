package com.kodilla.good.patterns.food2door;

public class OrderDto {

    public OrderDto(boolean isOrdered, String name, Product product, int amountOfProduct) {
        if (isOrdered) {
            System.out.println("sending information about the order to the database: " + name + ", " + product.getName() + ", " + amountOfProduct);
        } else {
            System.out.println("sending information about lack of a " + product.getName() + " in " + name);
        }
    }
}
