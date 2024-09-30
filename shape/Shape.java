package com.evy.example.shape;

public abstract class Shape {

    private final String color;

    public Shape(String color) {
        this.color = (color == null || color.isEmpty()) ? "White" : color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

    public abstract double area();
    public abstract double circumference();
}
