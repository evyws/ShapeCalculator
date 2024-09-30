package com.evy.example.manager;

import com.evy.example.shape.Shape;

import java.util.ArrayList;

public final class ShapeManager {

    private static final ArrayList<Shape> arraylist = new ArrayList<>();


    public static void addShape(Shape shape) {
        arraylist.add(shape);
    }

    public static void getALlShapes() {
        if (arraylist.isEmpty()) {
            System.out.println("No Shapes Available");
        } else {
            System.out.println("Listing all shapes:");
            for (Shape shape : arraylist) {
                System.out.println(shape);
            }
        }
    }

    public static double sumAllCircumference(){
        double sum=0;
        for(Shape shape:arraylist){
            sum+=shape.circumference();
        }
        return sum;
    }

    public static double sumAllArea(){
        double sum=0;
        for(Shape shape:arraylist){
            sum+=shape.area();
        }
       return sum;
    }

    public static double findBiggestCircumference() {
        if (arraylist.isEmpty()) {
            System.out.println("No Shapes Available");
            return 0;
        }

        double maxCircumference = Double.MIN_VALUE;
        for (Shape shape : arraylist) {
            double currentCircumference = shape.circumference();
            if (currentCircumference > maxCircumference) {
                maxCircumference = currentCircumference;
            }
        }

        return maxCircumference;
    }

    public static double findBiggestArea() {
        if (arraylist.isEmpty()) {
            System.out.println("No Shapes Available");
            return 0;
        }

        double maxArea = Double.MIN_VALUE;
        for (Shape shape : arraylist) {
            double currentArea = shape.area();
            if (currentArea > maxArea) {
                maxArea = currentArea;
            }
        }

        return maxArea;
    }



}
