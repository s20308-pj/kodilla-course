package com.kodilla.good.patterns.food2door;


public interface Supplier {

    String getName();

    boolean isProductsExist(Product product);

    Integer amountOfProduct(Product product);

    void process(Product product, int amountOfProduct);
}
