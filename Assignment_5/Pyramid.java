// Pyramid.java

import java.util.Scanner;

public class Pyramid extends Shape implements Volume {
    private double baseLength;
    private double baseWidth;
    private double height;

    @Override
    public double calculateShape() {
        // Surface area of a pyramid
        return baseLength * baseWidth + 0.5 * baseLength * Math.sqrt(Math.pow(baseWidth / 2, 2) + Math.pow(height, 2))
                + 0.5 * baseWidth * Math.sqrt(Math.pow(baseLength / 2, 2) + Math.pow(height, 2));
    }

    @Override
    public double calculatePerimeter() {
        // Perimeter calculation for a 3D shape is not applicable
        return 0;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * baseLength * baseWidth * height;
    }

    // Function to get input from the user
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base length of the pyramid: ");
        this.baseLength = scanner.nextDouble();
        System.out.print("Enter the base width of the pyramid: ");
        this.baseWidth = scanner.nextDouble();
        System.out.print("Enter the height of the pyramid: ");
        this.height = scanner.nextDouble();
    }
}
