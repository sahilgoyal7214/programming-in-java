// Neighbours.java
//Sahil Goyal
//AIML-B1
//2022-26
//22070126094
package Assignment_2;

import java.io.IOException;
import java.util.Scanner;

public class Neighbours {
    public static void main(String[] args) throws IOException {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Enter the size of the array: ");
        
        // Read the size of the array from user input
        int size = sc.nextInt();

        // Get the array input from the user using the UserInput class
        double[] array = UserInput.inputArray(size);
        sc.close();

        // Find and print the index of the nearest neighbours in the array
        System.out.println("Index of Nearest Neighbours: " + findNearestNeighbours(array));
    }

    // Method to find the index of nearest neighbours in the array
    public static int findNearestNeighbours(double[] arr) {
        double minDistance = Double.MAX_VALUE;
        int index = -1;

        // Iterate through the array and calculate distances between adjacent elements
        for (int i = 0; i < arr.length - 1; i++) {
            double distance = Math.abs(arr[i] - arr[i + 1]);

            // Update the index if the current distance is smaller than the minimum distance
            if (distance < minDistance) {
                minDistance = distance;
                index = i;
            }
        }

        // Return the index of the nearest neighbours
        return index;
    }
}