// Rectangle.java
import java.util.Scanner;

public class Rectangle extends Shape {
    private double length;
    private double width;

    @Override
    public double calculateShape() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Function to get input from the user
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        this.length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        this.width = scanner.nextDouble();
    }
}

