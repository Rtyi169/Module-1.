package com.name.module1_4;

public abstract class TwoDShape {
    private double width;
    private double height;
    private Color color;

    public TwoDShape(double width, double height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public TwoDShape() {
        this.width = 0.0;
        this.height = 0.0;
        this.color = Color.NONE;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double getArea();
}