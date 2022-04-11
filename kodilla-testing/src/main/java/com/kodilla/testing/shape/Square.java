package com.kodilla.testing.shape;

public class Square implements Shape{
    private final String name = "Square";
    private final double filed;

    public Square(double filed) {
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
