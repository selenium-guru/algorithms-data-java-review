package InterviewQuestions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by SeleniumGuru.com on 5/6/18.
 *
 *
 *
 * Given an array of n numbers, find two elements such that their sum is equal to “value”
 *
 * Assumption
 * Array consists of integer
 * any duplicates
 * sorted
 *
 * Pseudo code
 * Initialize sum as 0
 * ArrayList that will store two elements
 * Loop in array
 *  if two elements equal to the sum, return the two elements
 *

 */
public class FindPairInArray {
    public static void main(String[] args){
        int[] arr = {1, 7, 3, 2, 5};
        //find two elements where the sum of two elements equal to value
        System.out.println(findTwoElementsSumEqualToValue1(arr, arr.length, 9));
        System.out.println(findTwoElementsSumEqualToValue2(arr, arr.length, 9));
    }

    public static ArrayList<Integer> findTwoElementsSumEqualToValue1(int[] arr, int size, int value){
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i=0; i<size; i++){
            for(int j=i+1; j<size; j++) {
                int sum = arr[i] + arr[j];
                if ((sum == value)) {
                    arr1.add(arr[i]);
                    arr1.add(arr[j]);
                }
                if (arr1.size() == 2){
                    return arr1;
                }
            }

        }
        return arr1;
    }

    /*
    //Second method

    - Sort the array
    - then make the first element as the first
    - then make the last element as the second
    - for loop array
        - get the sum and make it as curr
        - if curr == value
            add both the elements in array list
          else if curr > value
            increment the first element
          else
            decrement the second element
        return arraylist


     */

    public static ArrayList<Integer> findTwoElementsSumEqualToValue2(int[] arr, int size, int value){
        ArrayList<Integer> arr1 = new ArrayList<>();
        int first = 0;
        int second = size-1;
        int curr;
        Arrays.sort(arr);
        while (first < second) {
            curr = arr[first] + arr[second];
            if (curr == value){
                arr1.add(arr[first]);
                arr1.add(arr[second]);
                return arr1;

            } else if (curr < value){
                first++;
            } else {
                second--;
            }
        }
        return arr1;

    }
}
