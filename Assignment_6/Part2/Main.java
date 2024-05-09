// Main.java
package Assign6.Part2;

// Main class to test duck behaviors
public class Main {
    public static void main(String[] args) {
        // Create a RedHeadDuck object
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        
        // Display information about RedHeadDuck
        redHeadDuck.display();
        
        // Perform swim, fly, and quack behaviors of RedHeadDuck
        redHeadDuck.performSwim();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();

        // Create a DecoyDuck object
        DecoyDuck decoyDuck = new DecoyDuck();
        
        // Display information about DecoyDuck
        decoyDuck.display();
        
        // Perform fly, quack, and swim behaviors of DecoyDuck
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.performSwim();
    }
}