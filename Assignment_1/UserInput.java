// UserInput.java
package Assign1;

import java.util.Scanner;

public class UserInput {
    // Scanner object for reading input
    private Scanner scanner;

    // Constructor initializes the Scanner
    public UserInput() {
        scanner = new Scanner(System.in);
    }

    // Method to get a double input from the user with a prompt message
    public double getDoubleInput(String message) {
        System.out.println(message);
        return scanner.nextDouble();
    }

    // Method to get a string input from the user with a prompt message
    public String getStringInput(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    // Method to get an array input from the user with a prompt message
    public double[] getArrayInput() {
        Scanner sc = new Scanner(System.in); 

        // Prompt user for the size of the array
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        
        // Create an array to store the input elements
        double[] array = new double[size];
        
        // Prompt user to enter each element of the array
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) { 
            // Check if the next input is a double
            if (sc.hasNextDouble()) { 
                array[i] = sc.nextDouble(); 
            } 
        }
        sc.close(); // Close the inner scanner
        return array;
    }

    // Method to close the Scanner when it is no longer needed
    public void closeScanner() {
        scanner.close();
    }
}
