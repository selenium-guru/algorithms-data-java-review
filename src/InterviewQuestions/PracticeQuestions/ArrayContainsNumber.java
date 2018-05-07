package InterviewQuestions.PracticeQuestions;

import javax.management.ObjectInstance;

/**
 * Created by SeleniumGuru.com on 5/5/18.
 */
public class ArrayContainsNumber {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2  = {1, 2, 3, 4, 6, 3};
        System.out.println(containsNumber(arr1, 3));
        System.out.println(containsNumber(arr2, 7));

    }

    //Find array contains number
    private static boolean containsNumber(int[] arr, int num){
        for(int i: arr){
            if (i == num){
                return true;
            }
        }
        return false;
    }

}
