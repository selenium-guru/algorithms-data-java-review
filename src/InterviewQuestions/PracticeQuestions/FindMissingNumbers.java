package InterviewQuestions.PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by SeleniumGuru.com on 5/5/18.
 */
public class FindMissingNumbers {

    public static void main(String[] args){
        int[] iArray = new int[]{1, 2, 3, 5, 7,9,10};
        System.out.println(findMissingNumbers(iArray));
    }


    private static ArrayList<Integer> findMissingNumbers(int[] numbers){
        ArrayList<Integer> numbersArray = new ArrayList<>();
        //sort the numbers
        Arrays.sort(numbers);
        int lastNumber = 0;
        //get the last number which will be your max element
        for (int i=0; i < numbers.length; i++){
            lastNumber = numbers[i];
        }

        //Now compare the element and if n+1 = value +1, put it in arraylist
        for (int i=0; i<numbers.length-1; i++){
            if (numbers[i+1] != numbers[i]+1){
                numbersArray.add(numbers[i] + 1);
            }
        }
        return numbersArray;
    }
}
