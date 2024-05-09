// UserInput.java
package Assign7;

import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    // Constructor initializes the Scanner object for user input
    public UserInput() {
        scanner = new Scanner(System.in);
    }

    // Method to get a double input from the user with a prompt message
    // Throws NonNumericInputException if input is not a valid double
    public double getDoubleInput(String message) throws CustomException.NonNumericInputException {
        System.out.println(message);
        String input = scanner.next();
        if (!isNumeric(input)) {
            throw new CustomException.NonNumericInputException("Non-numeric input error");
        }
        return Double.parseDouble(input);
    }

    // Method to get a string input from the user with a prompt message
    public String getStringInput(String message) {
        System.out.println(message);
        return scanner.next();
    }

    // Method to get an array input from the user with a prompt message
    public double[] getArrayInput() {
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        
        double[] array = new double[size];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) { 
            if (scanner.hasNextDouble()) { 
                array[i] = scanner.nextDouble(); 
            } 
        }
        return array;
    }

    // Method to close the Scanner when it is no longer needed
    public void closeScanner() {
        scanner.close();
    }

    // Method to check if a string can be parsed as a double
    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
