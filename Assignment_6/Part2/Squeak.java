// Squeak.java
package Assign6.Part2;

// Squeak class implements the QuackBehaviour interface to represent squeaking behavior
public class Squeak implements QuackBehaviour {
    // Method implementation for quacking behavior
    @Override
    public void quack() {
        System.out.println("Duck only Squeaks!!"); // Print a message indicating the duck is squeaking
    }
}