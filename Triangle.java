package com.name.module1_1;

public class Triangle extends TwoDShape {
    private double side1;
    private double side2;
    private double side3;
    //Calculates and returns the area of the triangle
    //return The area of the triangle.
    public double getArea() {
        // Calculation logic for the area...
        return getArea();
    }

    // Rest of the class...
    public Triangle(double width, double height) {
        super(width, height);
        this.side1 = width;
        this.side2 = height;
        this.side3 = calculateThirdSide(width, height);
    }

    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private double calculateThirdSide(double width, double height) {
        // Implementation to calculate the third side of the triangle using Heron's formula
        return Math.sqrt(width * width + height * height);
    }
}