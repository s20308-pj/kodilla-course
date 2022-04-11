package com.kodilla.testing.shape;

public class Circle implements Shape{
    private final String name = "Circle";
    private final double filed;

    public Circle(double filed) {
        this.filed = filed;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public Double getField() {
        return filed;
    }
}
