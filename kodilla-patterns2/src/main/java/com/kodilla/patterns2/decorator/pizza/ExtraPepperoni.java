package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraPepperoni extends AbstractPizza{
    public ExtraPepperoni(PizzaOrder thePizza) {
        super(thePizza);
    }

    @Override
    public BigDecimal getPrise() {
        return super.getPrise().add(new BigDecimal(3));
    }

    @Override
    public String GetName() {
        return super.GetName() + " + pepperoni";
    }
}
