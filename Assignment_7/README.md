# Custom Exceptions in Java - Calculator

This Java program demonstrates the implementation of custom exceptions (`CustomException`) to handle specific error conditions in a calculator application (`Calculator`).

## Program Components

### `Calculator.java`
- Provides various mathematical operations (addition, subtraction, multiplication, division, mean, square root, standard deviation, variance, power).
- Throws a custom exception (`CustomException`) when attempting to divide by zero.

### `CustomException.java`
- Defines custom exceptions:
  - `CustomException`: General exception class to handle division by zero errors.
  - `NonNumericInputException`: Nested class to handle non-numeric input errors.

### `UserInput.java`
- Manages user input:
  - Retrieves double input from the user and checks for numeric validity.
  - Retrieves string input and array input (for statistical operations).

### `Main.java`
- Contains the main method to interact with the calculator application.
- Handles user input for choosing operations and operands.
- Executes appropriate operations using the `Calculator` class and handles custom exceptions.

## Usage

1. **Compilation:**
   - Compile all Java files in the package using:
     ```
     javac Assignment_7/*.java
     ```

2. **Execution:**
   - Run the compiled `Main` class using:
     ```
     java Assignment_7.Main
     ```

3. **Operation Selection:**
   - Choose an operation (`+`, `-`, `/`, `*`, `^`, `var`, `stddev`, `avg`).
   - For basic arithmetic operations (`+`, `-`, `*`, `/`, `^`), enter two numbers.
   - For statistical operations (`var`, `stddev`, `avg`), enter an array of numbers.

4. **Error Handling:**
   - The program handles division by zero errors with a custom exception.
   - Non-numeric input is validated and handled using custom exceptions.

5. **Output:**
   - The program displays the result of the chosen operation or error messages for invalid inputs.



## Author

- [Sahil Goyal](https://github.com/sahilgoyal7214)

Feel free to explore and modify the program to add new mathematical operations or improve error handling using custom exceptions. This project showcases the use of custom exceptions to enhance the robustness and user experience of a calculator application in Java.
