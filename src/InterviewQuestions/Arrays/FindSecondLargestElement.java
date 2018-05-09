package InterviewQuestions.Arrays;

import java.util.Arrays;

/**
 * Created by SeleniumGuru.com on 5/7/18.
 *
 * Suppose you are given an unsorted array of n distinct elements.
 * How will you identify the second largest element
 * with minimum number of comparisons?

 Jain, Hemant. Problem Solving in Data Structures & Algorithms Using Java: Programming Interview Guide (p. 98). UNKNOWN. Kindle Edition.
 */
public class FindSecondLargestElement {
    public static void main(String[] args){
        //sample arr
        int[] arr1  = {1, 2, 4, 7, 9, 6, 11, 10};
        System.out.println(findSecondLargestElement(arr1, arr1.length));
    }

    //Pseudo code
    //Assumptions
    //Array contains integers
    //Array sorted or not - Can we sort them
    //What is the range?
    //Any duplicate numbers??

    //Solution
    /*
     - First sort the array
     - Find the second last element (n-2)
     */

    public static int findSecondLargestElement(int[] arr, int size){
        int secondLargest = arr[0];
        Arrays.sort(arr);
        secondLargest = arr[size-2];
        return secondLargest;
    }
}
