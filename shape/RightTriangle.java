package com.evy.example.shape;

public class RightTriangle extends Shape {

    private final double width, height;

    public RightTriangle(String color,double width, double height) {
        super(color);
        this.width = (width > 0) ? width : 0;
        this.height = (height > 0) ? height : 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", RightTriangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + area() +
                ", circumference=" + circumference() +
                '}';
    }


    @Override
    public double area() {
        return (this.width * this.height) / 2;
    }

    @Override
    public double circumference() {
        return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
    }
}
