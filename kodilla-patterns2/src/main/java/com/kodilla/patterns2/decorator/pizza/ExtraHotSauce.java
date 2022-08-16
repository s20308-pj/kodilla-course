package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraHotSauce extends AbstractPizza{
    protected ExtraHotSauce(PizzaOrder thePizza) {
        super(thePizza);
    }

    @Override
    public BigDecimal getPrise() {
        return super.getPrise().add(new BigDecimal(2));
    }

    @Override
    public String GetName() {
        return super.GetName() + " + hot sauce";
    }
}
