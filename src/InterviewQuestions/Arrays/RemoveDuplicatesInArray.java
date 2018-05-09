package InterviewQuestions.Arrays;

import java.util.ArrayList;

/**
 * Created by Ashok Tulachan on 5/7/18.
 * //Assumptions
 * //Array of integers
 * //Duplicates
 * //Sorted or not - doesn't matter
 *
 *
 * //Pseudocode
 * //one loop for non sorted
 * //Create an array list
 * //Add element in array list if the array list does not contain index element of an array
 *
 */
public class RemoveDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr  = {1, 2, 1, 3, 4, 5};
        //Get array without duplicates
        System.out.println(findNonDuplicates(arr));
    }

    //Find non duplicate element and add in arraylist
    public static ArrayList<Integer> findNonDuplicates(int[] arr){
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if (!arr2.contains(arr[i])){
              arr2.add(arr[i]);
            }
        }
        return arr2;

    }
}
