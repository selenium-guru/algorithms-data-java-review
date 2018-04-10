package chapter4;

/**
 * Created by SeleniumGuru.com on 4/9/18.
 */

class StackX {
    private int maxSize;
    private long[] stackArray;
    private int top; //top of stack

    //----------------------------------

    public StackX(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    //----------------------------------
    //put item on top of stack
    public void push(long j){
        stackArray[++top] = j;
    }

    //----------------------------------
    //remove item from top of stack
    public long pop(){
        return stackArray[top--];
    }

    //----------------------------------
    //peek at top of stack
    public long peek(){
        return stackArray[top];
    }

    //----------------------------------
    //return true if stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    //----------------------------------
    //return true if stack is full
    public boolean isFull() {
        return(top == maxSize-1);
    }

}



public class StackApp {
    public static void main(String[] args){
        StackX theStack = new StackX(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        while(!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.print(value); //display it
            System.out.print(" ");
        }
        System.out.println("");
    }

}
