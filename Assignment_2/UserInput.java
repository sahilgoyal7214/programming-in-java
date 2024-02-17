// UserInput.java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
    // Method to get an array input from the user
    public static double[] inputArray(int size) throws IOException {
        // Create a BufferedReader to read user input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Prompt the user to enter the array elements
        System.out.println("Enter the array elements separated by spaces: ");

        // Read the array input as a string
        String array = br.readLine();

        // Initialize an array to store the input elements
        double[] arrayInput = new double[size];

        // Split the input string and convert each element to double
        String[] input = array.trim().split("\\s+");

        // Populate the array with the converted elements
        for (int i = 0; i < size; i++) {
            arrayInput[i] = Double.parseDouble(input[i]);
        }

        // Return the array containing user-input elements
        return arrayInput;
    }
}