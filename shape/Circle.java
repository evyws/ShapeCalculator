package com.evy.example.shape;

public class Circle extends Shape{

    private final double radius;
    public Circle(String color,double radius) {
        super(color);
        this.radius=(radius>0)?radius:0;
    }
    @Override
    public String toString() {
        return super.toString() + ", Circle{" +
                "radius=" + radius +
                ", area=" + area() +
                ", circumference=" + circumference() +
                '}';
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(this.radius,2);
    }

    @Override
    public double circumference() {
        return 2* Math.PI*this.radius;
    }
}
