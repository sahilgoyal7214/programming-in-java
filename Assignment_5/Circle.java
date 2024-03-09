// Circle.java


import java.util.*;

public class Circle extends Shape implements Volume {
    private double radius;

    @Override
    public double calculateShape() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateVolume() {
        // Volume calculation for a 3D circle (sphere) is not included for simplicity
        return 0;
    }

    // Function to get input from the user
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        this.radius = scanner.nextDouble();
    }
}
