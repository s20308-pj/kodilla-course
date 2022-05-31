package com.kodilla.good.patterns.food2door;


public class OrderRequest {
    private Product product;
    private int amountOfProduct;

    public OrderRequest(Product product, int amountOfProduct) {
        this.product = product;
        this.amountOfProduct = amountOfProduct;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmountOfProduct() {
        return amountOfProduct;
    }

    public boolean checkProduct(Supplier supplier, Product product, int amountOfProduct) {
        if (supplier.isProductsExist(product)
                && supplier.amountOfProduct(product) >= amountOfProduct) {
            return true;
        }
        return false;
    }
}
