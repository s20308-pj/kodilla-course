package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraMozzarella extends AbstractPizza{
    protected ExtraMozzarella(PizzaOrder thePizza) {
        super(thePizza);
    }

    @Override
    public BigDecimal getPrise() {
        return super.getPrise().add(new BigDecimal(3));
    }

    @Override
    public String GetName() {
        return super.GetName()+" + mozzarella";
    }
}
