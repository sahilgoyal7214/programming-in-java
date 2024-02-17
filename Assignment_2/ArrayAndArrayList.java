// ArrayAndArrayList.java
//Sahil Goyal
//AIML-B1
//2022-26
//22070126094
package Assignment_2;

import java.io.IOException;
import java.util.*;

public class ArrayAndArrayList {
    public static void main(String[] args) throws IOException {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Enter the size of array: ");

        // Read the size from user input
        int size = sc.nextInt();

        // Get the primitive double array from user input using UserInput class
        double[] array = UserInput.inputArray(size);

        // Close the Scanner to avoid resource leaks
        sc.close();

        // Print the primitive double array using Arrays.toString
        System.out.println(Arrays.toString(array));

        // Convert the primitive double array to an ArrayList<Double>
        System.out.println("Primitive array to ArrayList: ");
        List<Double> arrlist = Arrays.asList(Arrays.stream(array).boxed().toArray(Double[]::new));

        // Print the elements of the ArrayList using a for-each loop
        for (Double element : arrlist) {
            System.out.println(element);
        }

        // Convert ArrayList to array
        System.out.println("ArrayList to array: ");
        double[] arr = arrlist.stream().mapToDouble(Double::doubleValue).toArray();
        System.out.println(Arrays.toString(arr));
    }
}