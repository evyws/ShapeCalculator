package com.evy.example.shape;

public class Rectangle extends Shape{

    private final double width,height;
    public Rectangle(String color,double width,double height) {
        super(color);
        this.width=(width>0)?width:0;
        this.height=(height>0)?height:0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + area() +
                ", circumference=" + circumference() +
                '}';
    }

    @Override
    public double area() {
        return this.width*this.height;
    }

    @Override
    public double circumference() {
        return 2 * (this.width + this.height);
    }
}
