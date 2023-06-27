package com.name.module1_4;

public class Circle extends TwoDShape {
    private final double PI = 3.14159;
    private double radius;

    public Circle(double radius, Color color) {
        super();
        this.radius = radius;
        setColor(color);
    }

    public double getArea() {
        return PI * radius * radius;
    }

    // Rest of the clas
}