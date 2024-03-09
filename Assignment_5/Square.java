// Square.java

import java.util.Scanner;

public class Square extends Shape {
    private double side;

    @Override
    public double calculateShape() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    // Function to get input from the user
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        this.side = scanner.nextDouble();
    }
}
