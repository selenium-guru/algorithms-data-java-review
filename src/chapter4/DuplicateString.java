package chapter4;

/**
 * Created by SeleniumGuru.com on 4/9/18.
 */

class StackZ {
    private int maxSize;
    private String[] stackArray;
    private int top;


    public StackZ(int s){
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

public class DuplicateString {
    public static void main(String[] args){
        String[] myArray = new String[] { "Hello", "Test", "First", "DW", "Test"};
        StackZ theStack = new StackZ(myArray.length);

        for(int i=0; i<myArray.length; i++){
            theStack.push(myArray[i]); //push it to the stack
        }
        String[] newArray = new String[myArray.length];
        for(int j=0; j<myArray.length; j++){
            String s = theStack.pop(); //pop the last element out
            newArray[j] = s;
        }

//        String[] noDupsArray = findDups(myArray);
//        for(int k = 0; k < noDupsArray.length; k++){
//            System.out.print(noDupsArray[k] + " ");
//        }

//
        //display now

        StackZ newStack = new StackZ(newArray.length);
        for(int k=0; k<newArray.length; k++){
            for(int l=k; l<newArray.length; l++){
                if (l+1 == (newArray.length))
                {
                   break;
                }
                else if (!newArray[l].equalsIgnoreCase(newArray[l+1])){
                    newStack.push(newArray[k]);
                }
            }  //print out the array elements
        }


        for(int z=0; z<myArray.length; z++){
            System.out.print(myArray[z]);
        }

    }




}
