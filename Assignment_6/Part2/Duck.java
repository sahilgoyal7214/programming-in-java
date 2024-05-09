//Duck.java
package Assign6.Part2;

// Duck class serves as the abstract base class for different types of ducks
abstract public class Duck {
    // Attributes to hold behaviors
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour;

    // Method to set fly behavior dynamically
    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    // Method to set quack behavior dynamically
    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

    // Method to set swim behavior dynamically
    public void setSwimBehaviour(SwimBehaviour sb) {
        swimBehaviour = sb;
    }
    
    // Abstract method for displaying duck
    abstract public void display();

    // Method to perform fly behavior
    public void performFly() {
        flyBehaviour.fly();
    }

    // Method to perform quack behavior
    public void performQuack() {
        quackBehaviour.quack();
    }

    // Method to perform swim behavior
    public void performSwim() {
        swimBehaviour.swim();
    }
}
