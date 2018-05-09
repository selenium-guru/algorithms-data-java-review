package InterviewQuestions.Arrays;

import java.util.Arrays;

/**
 * Created by Ashok Tulachan on 5/7/18.
 */
public class PermutationOfEachOther {
    public static void main(String[] args) {
        //arr
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        int[] arr3 = {1, 3, 2, 5, 4};
        int[] arr4 = {1, 5, 4, 3, 2};
        //find if arr1 and arr2 are permutations of each other
        System.out.println(isPermutationOfEachOther(arr1, arr2));
        System.out.println(isPermutationOfEachOther(arr1, arr3));
        System.out.println(isPermutationOfEachOther(arr1, arr4));

    }

    //Pseudocode
    //Assumptions
    //Are both array of same length
    //If no - return false cannot be permuations
    //if yes - are there any duplicates on both array
    //Both array contains integers

    //Pseudo code
    /*
        - Sort both arr1 and arr2
        - if arr1.length is not equal to arr2.length, return false
        - loop and see if they contain same numbers
     */

    public static boolean isPermutationOfEachOther(int[] arr1, int[] arr2){
        //Sort the array
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (arr1.length != arr2.length){
            return false;
        }
        int i, j;
        //for loop and check if each element of arr1 equals to arr2
        for(i=0,j=0; i<arr1.length; i++, j++){
            if (arr1[i] != arr2[j]) {
                return false;
            }
        }
        return true;

    }
}
