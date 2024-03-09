// Cylinder.java


import java.util.Scanner;

public class Cylinder extends Shape implements Volume {
    private double radius;
    private double height;

    @Override
    public double calculateShape() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double calculatePerimeter() {
        // Perimeter calculation for a 3D shape is not applicable
        return 0;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Function to get input from the user
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        this.radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        this.height = scanner.nextDouble();
    }
}
