package com.kodilla.good.patterns.food2door.producer;

import com.kodilla.good.patterns.food2door.Product;
import com.kodilla.good.patterns.food2door.Supplier;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Supplier {
    private String name = "HealthyShop";
    private Map<Product, Integer> productMap = new HashMap<>();

    public void addProductToMap(Product product, int amountOfProduct) {
        productMap.put(product, amountOfProduct);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isProductsExist(Product product) {
        return productMap.containsKey(product);
    }

    @Override
    public Integer amountOfProduct(Product product) {
        return productMap.get(product);
    }

    @Override
    public void process(Product product, int amountOfProduct) {
        int leftOfProduct = productMap.get(product) - amountOfProduct;
        productMap.remove(product);
        if (leftOfProduct > 0) {
            productMap.put(product, leftOfProduct);
        }
    }
}
