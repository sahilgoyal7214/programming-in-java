// Calculator.java
package Assign1;

import java.util.Arrays;

public class Calculator {
    // Method to add two numbers
    public static double add(double n1, double n2){
        return n1 + n2;
    }

    // Method to subtract two numbers
    public static double subtract(double n1, double n2){
        return n1 - n2;
    }

    // Method to multiply two numbers
    public static double multiply(double n1, double n2){
        return n1 * n2;
    }

    // Method to divide two numbers
    public static double divide(double n1, double n2){
        return n1 / n2;
    }

    // Method to calculate the mean (average) of an array of numbers
    public static double mean(double[] arr){
        return Arrays.stream(arr).sum() / arr.length;
    }

    // Method to calculate the square root of a number
    public static double sqrt(double n){
        return Math.pow(n, 0.5);
    }

    // Method to calculate the standard deviation of an array of numbers
    public static double stddev(double[] arr){
        double standardDeviation = 0.0;
        
        // Calculate the sum of squared differences from the mean
        for (double num : arr) {
            standardDeviation += Math.pow(num - mean(arr), 2);
        }

        // Calculate the square root of the average of squared differences
        return Math.sqrt(standardDeviation / arr.length);
    }

    // Method to calculate the variance of an array of numbers
    public static double variance(double[] arr){
        // Variance is the square root of the standard deviation
        return sqrt(stddev(arr));
    }

    // Method to calculate the power of a number raised to another number
    public static double power(double n1, double n2){
        return Math.pow(n1, n2);
    }
}
