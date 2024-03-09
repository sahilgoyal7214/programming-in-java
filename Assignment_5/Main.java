/*
 * Sahil Goyal
 * AIML-B1
 * 2022-26
 * 22070126094
 */
// Main.java

import java.util.Scanner;

public class Main {
    // Main function
    public static void main(String[] args) {
        // Add your name, PRN, and Batch details in comments here

        Scanner scanner = new Scanner(System.in);

        // Menu-driven program
        while (true) {
            System.out.println("\nSelect a shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateCircleAreaAndPerimeter();
                    break;
                case 2:
                    calculateRectangleAreaAndPerimeter();
                    break;
                case 3:
                    calculateSquareAreaAndPerimeter();
                    break;
                case 4:
                    calculateSphereAreaAndVolume();
                    break;
                case 5:
                    calculateCylinderAreaAndVolume();
                    break;
                case 6:
                    calculatePyramidAreaAndVolume();
                    break;
                case 0:
                    System.out.println("Ending program... So long comrade!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Function to calculate the area and perimeter of a circle
    private static void calculateCircleAreaAndPerimeter() {
        Circle circle = new Circle();
        circle.showShape("Circle");
        circle.getInput();

        double area = circle.calculateShape();
        double perimeter = circle.calculatePerimeter();

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    // Function to calculate the area and perimeter of a rectangle
    private static void calculateRectangleAreaAndPerimeter() {
        Rectangle rectangle = new Rectangle();
        rectangle.showShape("Rectangle");
        rectangle.getInput();

        double area = rectangle.calculateShape();
        double perimeter = rectangle.calculatePerimeter();

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    // Function to calculate the area and perimeter of a square
    private static void calculateSquareAreaAndPerimeter() {
        Square square = new Square();
        square.showShape("Square");
        square.getInput();

        double area = square.calculateShape();
        double perimeter = square.calculatePerimeter();

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    // Function to calculate the area and volume of a sphere
    private static void calculateSphereAreaAndVolume() {
        Sphere sphere = new Sphere();
        sphere.showShape("Sphere");
        sphere.getInput();

        double area = sphere.calculateShape();
        double volume = sphere.calculateVolume();

        System.out.println("Surface Area: " + area);
        System.out.println("Volume: " + volume);
    }

    // Function to calculate the area and volume of a cylinder
    private static void calculateCylinderAreaAndVolume() {
        Cylinder cylinder = new Cylinder();
        cylinder.showShape("Cylinder");
        cylinder.getInput();

        double area = cylinder.calculateShape();
        double volume = cylinder.calculateVolume();

        System.out.println("Surface Area: " + area);
        System.out.println("Volume: " + volume);
    }

    // Function to calculate the area and volume of a pyramid
    private static void calculatePyramidAreaAndVolume() {
        Pyramid pyramid = new Pyramid();
        pyramid.showShape("Pyramid");
        pyramid.getInput();

        double area = pyramid.calculateShape();
        double volume = pyramid.calculateVolume();

        System.out.println("Surface Area: " + area);
        System.out.println("Volume: " + volume);
    }
}
