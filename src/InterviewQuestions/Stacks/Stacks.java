package InterviewQuestions.Stacks;

import java.util.Stack;

/**
 * Created by Ashok Tulachan on 5/15/18.
 */
public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<Integer>();
        stack1.push(1);
        stack1.push(2);
        int[] arr1 = {1, 2, 3, 4, 5};
        for (int i=0; i < arr1.length; i++){
            if (arr1[i] % 2 == 0){
                stack1.push(arr1[i]);
            }
        }

        //print out the array
        for (int i=0; i < arr1.length; i++){
            System.out.println(stack1.pop());
            //stack1.pop();
        }
    }
}
