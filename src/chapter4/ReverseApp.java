package chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SeleniumGuru.com on 4/9/18.
 */
class StackY {
    private int maxSize;
    private char[] stackArray;
    private int top; //top of stack

    //----------------------------------

    public StackY(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    //----------------------------------
    //put item on top of stack
    public void push(char j){
        stackArray[++top] = j;
    }

    //----------------------------------
    //remove item from top of stack
    public char pop(){
        return stackArray[top--];
    }

    //----------------------------------
    //peek at top of stack
    public char peek(){
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

class Reverser {
    private String input; //input string
    private String output; //output string

    public Reverser(String in) {
        this.input = in;
    }

    public String doRev() {
        int stackSize = input.length();
        StackY theStack = new StackY(stackSize);

        for(int j=0; j<input.length(); j++){
            char ch = input.charAt(j);
            theStack.push(ch);
        }
        output= "";
        while (!theStack.isEmpty()){
            char ch = theStack.pop();
            output = output + ch;

        }
        return output;
    }
}


public class ReverseApp {
    public static void main(String[] args) throws IOException {
        String input, output;
        while(true) {
            System.out.print("Enter a string: ");
            System.out.flush();
            input = getString();

            if (input.equalsIgnoreCase("")){
                break;
            }

            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev();
            System.out.println("Reversed " + output);

        }
    }

    public static String getString() throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String s = br.readLine();
        return s;
    }
}
