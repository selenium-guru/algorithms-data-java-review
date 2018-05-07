package InterviewQuestions.Arrays;

import java.util.Arrays;

/**
 * Created by SeleniumGuru.com on 5/6/18.
 *
 * Given an array of numbers of size n, if all the elements of the array are
 * sorted then find the element, which lie at the index n/ 2.

.
 */
public class FindMedianOfArray {
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
        //find median of array
        System.out.println(findMedianArray(arr, arr.length));
    }

    public static int findMedianArray(int[] arr, int size){
        //Sort the array
        Arrays.sort(arr);
        return arr[size/2];
    }
}
