package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape){
        shapeList.add(shape);
    }
    public boolean removeFigure(Shape shape){
        for (Shape shapeFromList : shapeList) {
            if (shapeFromList.equals(shape)){
                shapeList.remove(shape);
                return true;
            }
        }
        return false;
    }
    public Shape getFigure(int n){

        return shapeList.get(n);
    }

    public String showFigures(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Shape shapeFromList : shapeList) {
            stringBuilder.append(shapeFromList.toString());
        }
        return stringBuilder.toString();
    }
}
