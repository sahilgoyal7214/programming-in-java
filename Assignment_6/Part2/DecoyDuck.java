// DecoyDuck.java
package Assign6.Part2;

// DecoyDuck class extends Duck class to represent a specific type of duck
public class DecoyDuck extends Duck {
    
    // Constructor for DecoyDuck initializes behaviors
    public DecoyDuck() {
        // Set fly behavior to unable to fly
        flyBehaviour = new FlyNoWay();
        // Set quack behavior to squeak
        quackBehaviour = new Squeak();
        // Set swim behavior to unable to swim
        swimBehaviour = new SwimNoWay();
    }
    
    // Method to display DecoyDuck
    @Override
    public void display() {
        System.out.println("I'm a decoy duck!!! lmao");
    }
}