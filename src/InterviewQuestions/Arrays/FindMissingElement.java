package InterviewQuestions.Arrays;

import java.util.Arrays;

/**
 * Created by SeleniumGuru.com on 5/6/18.
 *
 * Assumptions
 * Arrays sorted or not
 * if not sort the array
 * any duplicate numbers
 * Array consisting of integers
 *
 *
 * Pseudocode
 * loop in array
 * find if the next element is not equal to n-1 + 1,
 * if not, return the element
 */
public class FindMissingElement {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 4, 5, 6};
        System.out.println(findMissingElement(arr1, arr1.length));
    }


    public static int findMissingElement(int[] arr, int size){
        int i;
        Arrays.sort(arr);
        for(i=0;i<size-1;i++){
            if (arr[i] + 1 !=  arr[i+1]) {
                return arr[i] + 1;
            }
        }
        return Integer.MIN_VALUE;
    }
}
