package com.kodilla.good.patterns.food2door;

public class OrderProcessor {
    private Supplier supplier;


    public OrderProcessor(final Supplier supplier) {
        this.supplier = supplier;
    }

    public OrderDto order(final OrderRequest orderRequest){
        boolean isOrderedProductExist = orderRequest.checkProduct(supplier, orderRequest.getProduct(), orderRequest.getAmountOfProduct());
        if (isOrderedProductExist){
            supplier.process(orderRequest.getProduct(), orderRequest.getAmountOfProduct());
            return new OrderDto(true, supplier.getName(), orderRequest.getProduct(), orderRequest.getAmountOfProduct());
        } else {
            return new OrderDto(false, supplier.getName(), orderRequest.getProduct(), orderRequest.getAmountOfProduct());
        }
    }
}
