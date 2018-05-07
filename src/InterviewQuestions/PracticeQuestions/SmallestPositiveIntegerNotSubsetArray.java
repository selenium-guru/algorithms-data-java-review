package InterviewQuestions.PracticeQuestions;

import java.util.Arrays;

/**
 * Created by SeleniumGuru.com on 5/5/18.
 *
 * Assumptions
 * array could have duplicate numbers
 *
 *
 * Psuedo code
 * create an array
 * loop through the array
 * Initialize the element as 1
 * sum if nth index of array is equal to smaller than 1
 * return sum
 */
public class SmallestPositiveIntegerNotSubsetArray {
    public static void main(String[] args){
        //sample arr
        int arr1[] = {1, 3, 4, 5};
        int arr2[] = {1, 2, 6, 10, 11, 15};
        int arr3[] = {1, 1, 1, 1};
        int arr4[] = {1, 1, 3, 4};
        //int[] arr1 = {1, 2, 2, 3, 4};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
        System.out.println(returnSmallestNumber(arr1));
        System.out.println(returnSmallestNumber(arr2));
        System.out.println(returnSmallestNumber(arr3));
        System.out.println(returnSmallestNumber(arr4));
    }

    public static int returnSmallestNumber(int[] arr){
        //for loop
        int res = 1;
        for(int i = 0; i < arr.length && arr[i] <= res; i++){
            res = res + arr[i];
        }
        return res;
    }
}
