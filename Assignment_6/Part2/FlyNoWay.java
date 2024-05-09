// FlyNoWay.java
package Assign6.Part2;

// FlyNoWay class implements the FlyBehaviour interface to represent flying behavior where the duck cannot fly
public class FlyNoWay implements FlyBehaviour {
    
    // Method implementation for flying behavior
    public void fly() {
        System.out.println("Cannot fly.......lol"); // Print a message indicating the duck cannot fly
    }
    
}