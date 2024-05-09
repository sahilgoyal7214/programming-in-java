//Growable_stk.java
package Assign6.Part1;

import java.util.ArrayList;

public class Growable_stk implements Interface_STK{
    ArrayList<Integer> stack;
    int top;

    public Growable_stk(){
        top = -1;
        stack = new ArrayList<>(5);
    }

    @Override
    public boolean isEmpty(){
        return top == -1;
    }

    @Override
    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return stack.remove(top--);
        }
    }

    @Override
    public void push(int element){
        stack.add(++top, element);
    }

    @Override
    public boolean isFull(){
        System.out.println("Stack is not growable");
        return false;
    }


    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack.get(i) + " ");
            }
            System.out.println();
        }
}

}
