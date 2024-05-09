// Quack.java
package Assign6.Part2;

// Quack class implements the QuackBehaviour interface to represent quacking behavior
public class Quack implements QuackBehaviour {
    
    // Method implementation for quacking behavior
    @Override
    public void quack() {
        System.out.println("Duck says Quack Quack lmao"); // Print a message indicating the duck is quacking
    }
    
}