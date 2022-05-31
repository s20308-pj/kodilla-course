package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.producer.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.producer.GlutenFreeShop;
import com.kodilla.good.patterns.food2door.producer.HealthyShop;

public class Main {
    public static void main(String[] args) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();

        OrderProcessor extraFoodShopProcessor = new OrderProcessor(extraFoodShop);
        OrderProcessor glutenFreeShopProcessor = new OrderProcessor(glutenFreeShop);
        OrderProcessor healthyShopProcessor = new OrderProcessor(healthyShop);

        Product apple = new Product("apple", "healthy red apple");
        Product pear = new Product("pear", "sweet pear");
        Product milk = new Product("milk", "gluten-free");
        Product water = new Product("water", "water - drink to be healthy");

        extraFoodShop.addProductToMap(apple, 20);
        extraFoodShop.addProductToMap(pear, 10);
        glutenFreeShop.addProductToMap(milk, 20);
        healthyShop.addProductToMap(water, 50);

        extraFoodShopProcessor.order(new OrderRequest(apple,12));
        extraFoodShopProcessor.order(new OrderRequest(apple,18));
        extraFoodShopProcessor.order(new OrderRequest(pear,6));
        glutenFreeShopProcessor.order(new OrderRequest(milk,20));
        healthyShopProcessor.order(new OrderRequest(apple,18));
        healthyShopProcessor.order(new OrderRequest(water,25));
    }
}
