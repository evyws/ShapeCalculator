package com.evy.example.manager;

import com.evy.example.shape.*;
import java.util.HashMap;
import java.util.Scanner;

public final class ShapeFactory {

    private final HashMap<String, Runnable> map;
    private final Scanner sc = new Scanner(System.in);

    public ShapeFactory() {
        this.map = new HashMap<>();
        map.put("1", this::createSquare);
        map.put("2", this::createRectangle);
        map.put("3", this::createCircle);
        map.put("4", this::createRightTriangle);
    }

    public void setShape() {
        System.out.println(displayMenu());
        String choice = sc.nextLine();
        Runnable action = map.get(choice);
        if (action != null) {
            action.run();
        } else {
            System.out.println("Invalid choice. Please try again.\n");
        }
    }

    private String displayMenu() {
        return """
               1. Square
               2. Rectangle
               3. Circle
               4. Right Triangle
               """;
    }

    private void createSquare() {
        System.out.print("Enter color: ");
        String color = sc.nextLine();
        System.out.print("Enter width length: ");
        double width = sc.nextDouble();
        sc.nextLine();
        Shape shape = new Square(color, width);
        ShapeManager.addShape(shape);
        System.out.println("Square created: " + shape);
    }

    private void createRectangle() {
        System.out.print("Enter color: ");
        String color = sc.nextLine();
        System.out.print("Enter width length: ");
        double width = sc.nextDouble();
        System.out.print("Enter height length: ");
        double height = sc.nextDouble();
        sc.nextLine();
        Shape shape = new Rectangle(color, width, height);
        ShapeManager.addShape(shape);
        System.out.println("Rectangle created: " + shape);
    }

    private void createCircle() {
        System.out.print("Enter color: ");
        String color = sc.nextLine();
        System.out.print("Enter radius length: ");
        double radius = sc.nextDouble();
        sc.nextLine();
        Shape shape = new Circle(color, radius);
        ShapeManager.addShape(shape);
        System.out.println("Circle created: " + shape);
    }

    private void createRightTriangle() {
        System.out.print("Enter color: ");
        String color = sc.nextLine();
        System.out.print("Enter width length: ");
        double width = sc.nextDouble();
        System.out.print("Enter height length: ");
        double height = sc.nextDouble();
        sc.nextLine();
        Shape shape = new RightTriangle(color, width, height);
        ShapeManager.addShape(shape);
        System.out.println("Right Triangle created: " + shape);
    }
}
