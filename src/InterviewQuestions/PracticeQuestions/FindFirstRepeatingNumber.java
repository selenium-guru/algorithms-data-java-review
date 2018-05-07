package InterviewQuestions.PracticeQuestions;

import java.util.ArrayList;

/**
 * Created by SeleniumGuru.com on 5/5/18.
 *
 * Assumptions
 * Array until 100
 * Create an empty arraylist
 * Return the element if the nth index in array resides in arraylist
 */
public class FindFirstRepeatingNumber {
    public static void main(String[] args){
        //Array
        int[] arr = {1, 2, 5, 3, 4, 6};
        System.out.println(findFirstRepeatingNumber(arr));


    }

    public static Object findFirstRepeatingNumber(int[] arr){
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i: arr){
            if (arr1.contains(i)){
                return i;
            } else {
                arr1.add(i);
            }
        }
        return null;

    }
}
