package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizza implements PizzaOrder {
    private final PizzaOrder pizzaOrder;

    public AbstractPizza(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getPrise() {
        return pizzaOrder.getPrise();
    }

    @Override
    public String GetName() {
        return pizzaOrder.GetName();
    }
}
