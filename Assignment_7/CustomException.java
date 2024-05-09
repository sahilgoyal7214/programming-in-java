// CustomException.java
package Assign7;

// CustomException class extends Exception to handle custom exceptions
public class CustomException extends Exception {
    // Default constructor for CustomException class
    public CustomException(){
        super("Division by 0 error"); // Set default message for division by zero error
    }

    // Parameterized constructor for CustomException class to handle custom error messages
    public CustomException(String msg){
        super(msg); // Set custom error message
    }

    // Nested class NonNumericInputException extends Exception to handle non-numeric input errors
    public static class NonNumericInputException extends Exception {
        // Default constructor for NonNumericInputException class
        public NonNumericInputException() {
            super("Non-numeric input error"); // Set default message for non-numeric input error
        }

        // Parameterized constructor for NonNumericInputException class to handle custom error messages
        public NonNumericInputException(String msg) {
            super(msg); // Set custom error message
        }
    }
}