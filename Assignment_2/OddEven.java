// OddEven.java
//Sahil Goyal
//AIML-B1
//2022-26
//22070126094
package Assignment_2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) throws IOException {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Declare arrays for even and odd numbers
        double[] even;
        int j = 0;
        int k = 0;
        double[] odd;

        // Prompt the user to enter the number of elements
        System.out.println("Enter the number of elements to enter:");

        // Read the size from user input
        int size = sc.nextInt();

        // Initialize arrays for even and odd numbers based on the user-defined size
        even = new double[size];
        odd = new double[size];

        // Get the array input from the user using the UserInput class
        double[] array = UserInput.inputArray(size);

        // Close the Scanner to avoid resource leaks
        sc.close();

        // Separate even and odd numbers into their respective arrays
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                even[j] = array[i];
                j++;
            } else {
                odd[k] = array[i];
                k++;
            }
        }
        System.out.println("Even numbers:");
        System.out.print(Arrays.toString(even));
        System.out.println("Odd numbers:");
        System.out.print(Arrays.toString(odd));
    }
       // Method to print elements of an array 
       public static void print(double[] array, int size) { 
        for (int i = 0; i < size; i++) { 
            System.out.println(array[i]); 
        } 
    
}
}