// Sphere.java

import java.util.Scanner;

public class Sphere extends Shape implements Volume {
    private double radius;

    @Override
    public double calculateShape() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        // Perimeter calculation for a 3D shape is not applicable
        return 0;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Function to get input from the user
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        this.radius = scanner.nextDouble();
    }
}
