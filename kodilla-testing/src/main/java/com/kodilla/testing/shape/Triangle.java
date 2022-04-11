package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private final String name = "Triangle";
    private final double filed;

    public Triangle(double filed) {
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
