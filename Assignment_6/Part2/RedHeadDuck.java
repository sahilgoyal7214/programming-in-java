// RedHeadDuck.java
package Assign6.Part2;
// RedHeadDuck class extends Duck class to represent a specific type of duck
public class RedHeadDuck extends Duck {
    
    // Constructor for RedHeadDuck initializes behaviors
    public RedHeadDuck() {
        // Set fly behavior to fly with wings
        flyBehaviour = new FlyWithWings();
        // Set quack behavior to quack
        quackBehaviour = new Quack();
        // Set swim behavior to swim
        swimBehaviour = new Swim();
    }
    
    // Method to display RedHeadDuck
    @Override
    public void display() {
        System.out.println("I'm a red head duck!!! Lmao"); // Print a message indicating the duck is a red head duck
    }
}