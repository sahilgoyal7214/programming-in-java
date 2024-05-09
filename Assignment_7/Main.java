/*Sahil Goyal
AIML-B1
2022-26
22070126094
*/
//Main.java
package Assign7;

public class Main {
    public static void main(String[] args) {
        // Create an instance of UserInput to handle user input
        UserInput userInput = new UserInput();
        
        try {
            // Prompt the user to choose an operation
            String choice = userInput.getStringInput("Choose Operation: +, -, /, *, ^, var, stddev, avg");

            // Check if the chosen operation is a basic arithmetic operation or a statistical operation
            if (choice.equals("+") || choice.equals("-") || choice.equals("*") || choice.equals("/") || choice.equals("^")) {
                // For basic arithmetic operations, prompt the user to enter two numbers
                double n1 = userInput.getDoubleInput("Enter First Number:");
                double n2 = userInput.getDoubleInput("Enter Second Number:");
                userInput.closeScanner(); // Close the scanner since input is complete
                
                // Perform the chosen operation and display the result
                if (choice.equals("+")) {
                    System.out.println(Calculator.add(n1, n2));
                } else if (choice.equals("-")) {
                    System.out.println(Calculator.subtract(n1, n2));
                } else if (choice.equals("*")) {
                    System.out.println(Calculator.multiply(n1, n2));
                } else if (choice.equals("/")) {
                    // Handle division by zero exception
                    try {
                        System.out.println(Calculator.divide(n1, n2));
                    } catch (CustomException e) {
                        System.out.println(e.getMessage());
                    }
                } else if (choice.equals("^")) {
                    System.out.println(Calculator.power(n1, n2));
                } else {
                    System.out.println("Invalid Operation");
                }
            } else {
                // For statistical operations, prompt the user to enter an array of numbers
                double[] arr = userInput.getArrayInput();
                userInput.closeScanner(); // Close the scanner since input is complete
                
                // Perform the chosen statistical operation and display the result
                if (choice.equals("var")) {
                    System.out.println(Calculator.variance(arr));
                } else if (choice.equals("stddev")) {
                    System.out.println(Calculator.stddev(arr));
                } else if (choice.equals("avg")) {
                    System.out.println(Calculator.mean(arr));
                } else {
                    System.out.println("Invalid Operation");
                }
            }
        } catch (CustomException.NonNumericInputException e) {
            // Handle non-numeric input exception
            System.out.println(e.getMessage());
        }
    }
}
