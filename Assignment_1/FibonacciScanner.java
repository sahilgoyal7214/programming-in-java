/*
Vaibhav Sharma
AIML-B2
2022-26
22070126125
*/
package Assign1;

import java.util.Scanner;

// Class to calculate and print Fibonacci numbers
public class FibonacciScanner {

    // Main method to initiate program execution
    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the number of Fibonacci terms to generate
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = scan.nextInt();

        // Print the first n Fibonacci numbers
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Close the Scanner resource
        scan.close();
    }

    // Recursive method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {

        // Base cases: 0th and 1st Fibonacci numbers are 0 and 1, respectively
        if (n <= 1) {
            return n;
        } else {
            // Iteratively calculate Fibonacci numbers
            int a = 0, b = 1, c = 0;
            for (int i = 2; i <= n; i++) {
                c = a + b;  // Calculate the next Fibonacci number
                a = b;      // Update variables for the next iteration
                b = c;
            }
            return b;  // Return the calculated Fibonacci number
        }
    }
}
