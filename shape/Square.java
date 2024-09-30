package com.evy.example.shape;

public class Square extends Shape {

    private final double width;

    public Square(String color, double width) {
        super(color);
        this.width = width;
    }

    @Override
    public String toString() {
        return super.toString() + ", Square{" +
                "width=" + width +
                ", area=" + area() +
                ", circumference=" + circumference() +
                '}';
    }

    @Override
    public double area() {
        return Math.pow(this.width, 2);
    }

    @Override
    public double circumference() {
        return 4 * this.width;
    }
}
