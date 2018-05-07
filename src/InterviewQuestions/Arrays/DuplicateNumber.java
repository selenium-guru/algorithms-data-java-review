package InterviewQuestions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by SeleniumGuru.com on 5/6/18.
 *
 * Arrays unsorted or not
 * Brute force - two for loops to find the duplicate number and return the number
 */
public class DuplicateNumber {
    public static void main(String[] args){
        //sample arr
        int[] arr = {1, 2, 2, 3, 4, 4, 7};
        printRepeatingNumber(arr, arr.length);
        printRepeatingNumber2(arr, arr.length);
        printRepeatingNumber3(arr, arr.length);
        printRepeatingNumber4(arr, arr.length);
    }

    //Brute force - two loops
    public static void printRepeatingNumber(int[] arr, int size){
        //for loop
        for(int i=0; i<size; i++){
            for (int j=i+1; j<size; j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }

    //Sort first then loop first
    public static void printRepeatingNumber2(int[] arr, int size){
        //Sort array
        Arrays.sort(arr);
        //for loop
        for(int i=1; i<size; i++){
             if (arr[i] == arr[i-1]){
                 System.out.println(arr[i]);
            }
        }
    }

    //Use hashset and return the element if the hashset contains the index
    public static void printRepeatingNumber3(int[] arr, int size){
        HashSet<Integer> set = new HashSet<>();
        //for loop
        for(int i=0; i<size; i++){
            if (set.contains(arr[i])) {
                System.out.println(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }
    }

    //Sort first and use Hash Set
    public static void printRepeatingNumber4(int[] arr, int size){
        ArrayList<Integer> arr1 = new ArrayList<>();
        //for loop
        for(int i=0; i<size; i++){
            if (arr1.contains(arr[i])) {
                System.out.println(arr[i]);
            } else {
                arr1.add(arr[i]);
            }
        }
    }
}
