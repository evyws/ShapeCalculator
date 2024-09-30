package com.evy.example.screen;

import com.evy.example.manager.ShapeFactory;
import com.evy.example.manager.ShapeManager;

import java.util.HashMap;
import java.util.Scanner;

public final class MenuScreen {

    private final HashMap<String, Runnable> map;


    public MenuScreen() {
        this.map = new HashMap<>();
        this.map.put("1", this::addNewShape);
        this.map.put("2", this::listAllShapes);
        this.map.put("3", this::sumAllCircumferences);
        this.map.put("4", this::sumAllAreas);
        this.map.put("5", this::findBiggestCircumference);
        this.map.put("6", this::findBiggestArea);
        this.map.put("7", this::exitProgram);
    }

    public void runMenu() {
        while (true) {
            System.out.println(printWelcomeScreen());
            String choice = new Scanner(System.in).next();

            Runnable action = map.get(choice);
            if (choice.matches("[1-7]")) {
                action.run();
            } else {
                System.out.println("Invalid choice! Please select a valid option.\n");
            }
        }
    }

    private void addNewShape() {
        new ShapeFactory().setShape();
    }

    private void listAllShapes() {
        ShapeManager.getALlShapes();
    }

    private void sumAllCircumferences() {
        System.out.println(ShapeManager.sumAllCircumference());
    }

    private void sumAllAreas() {
        System.out.println(ShapeManager.sumAllArea());
    }

    private void findBiggestCircumference() {
        System.out.println(ShapeManager.findBiggestCircumference());
    }

    private void findBiggestArea() {
        System.out.println(ShapeManager.findBiggestArea());
    }

    private void exitProgram() {
        System.out.println("Good Bye!");
        System.exit(0);
    }

    private String printWelcomeScreen() {
        return """
               1. Add New Shape
               2. List All Shapes
               3. Sum All Circumferences
               4. Sum All Areas
               5. Find Biggest Circumference
               6. Find Biggest Area
               7. Exit
               Enter Your Choice:
               """;
    }


}
