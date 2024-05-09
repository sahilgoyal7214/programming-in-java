// Fixed_STK.java
package Assign6.Part1;
public class Fixed_STK implements Interface_STK
{
    private int arr[];
    private int top;
    private int size;
    @Override
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            int item = arr[top];
            top--;
            return item;
        }
    }
    
    public void push(int element){
        if(isFull()){
            System.out.println("Stack is full");
        }
        else{
            top++;
            arr[top] = element;
            System.out.printf("%d pushed\n", element);
        }
    }

    public Fixed_STK(int[] arr, int top){
        this.arr = arr;
        this.top = top;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            for(int i = top; i >= 0; i--){
                System.out.println(arr[i]);
            }
        }
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size - 1;
    }
}
