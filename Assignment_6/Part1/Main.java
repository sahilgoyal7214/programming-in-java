//Main.java
package Assign6.Part1;

public class Main {
    public static void main(String[] args) {

        Growable_stk g = new Growable_stk();
        g.push(1);
        g.push(2);
        g.push(3);
        g.push(4);
        g.push(5);
        g.display();
        g.push(6);
        g.display();

        System.out.println("Popped Element:" + g.pop());
        g.display();

        System.out.println("Popped Element:" + g.pop());
        g.display();

        System.out.println("Popped Element:" + g.pop());
        g.display();

        System.out.println("Popped Element:" + g.pop());
        g.display();

        System.out.println("Popped Element:" + g.pop());
        g.display();

        System.out.println("Popped Element:" + g.pop());
        g.display();
    }
}
