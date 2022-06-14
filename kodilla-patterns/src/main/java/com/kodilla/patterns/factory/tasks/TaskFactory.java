package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public final static String SHOPPING = "SHOPPING";
    public final static String PAINTING = "PAINTING";
    public final static String DRIVING = "DRIVING";

    public final Task taskFactory(final String task) {
        return switch (task) {
            case "SHOPPING" -> new ShoppingTask("grocery shopping", "fruit", 20);
            case "PAINTING" -> new PaintingTask("painting living room", "white", "walls");
            case "DRIVING" -> new DrivingTask("morning drive", "to work", "car");
            default -> null;
        };
    }
}
