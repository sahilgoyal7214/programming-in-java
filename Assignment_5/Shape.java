// Shape.java

public abstract class Shape {
    // Non-abstract method
    public void showShape(String shape) {
        System.out.println("Selected shape: " + shape);
    }

    // Abstract methods to be implemented by subclasses
    public abstract double calculateShape();
    public abstract double calculatePerimeter();
}
