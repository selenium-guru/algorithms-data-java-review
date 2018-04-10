package chapter4;

/**
 * Created by SeleniumGuru.com on 4/9/18.
 */

class StackL {
    private int maxSize;
    private String[] stackArray;
    private int top;


    public StackL(int s){
        maxSize = s;
        stackArray = new String[s]; //create a stack
        top = -1; //make the stack empty
    }

    public void push(String s){
        stackArray[++top] = s;
    }

    public String pop() {
        return stackArray[top--];
    }

    public String peek(String s){
        return stackArray[top];
    }

    public boolean isEmpty(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
}

public class ReverseString {
    public static void main(String[] args){
        String[] myArray = new String[] { "Hello", "Test", "First", "DW"};
        StackL theStack = new StackL(myArray.length);

        for(int i=0; i<myArray.length; i++){
            theStack.push(myArray[i]); //push it to the stack
        }
        String[] newArray = new String[myArray.length];
        for(int j=0; j<myArray.length; j++){
            String s = theStack.pop(); //pop the last element out
            newArray[j] = s;    //add it in the new array
        }
//
        //display now
        for(int k=0; k<newArray.length; k++){
            System.out.println(newArray[k]);    //print out the array elements
        }

    }

}
