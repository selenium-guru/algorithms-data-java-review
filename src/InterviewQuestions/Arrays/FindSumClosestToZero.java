package InterviewQuestions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by SeleniumGuru.com on 5/6/18.
 *
 * Given an Array of integer s, both + ve and -ve.
 * You need to find the two elements such that their sum is closest to
 * zero.

 * Assumptions/Questios
 * Both +ve and -ve
 * Array containing integer
 * Array contain duplicates or not
 *
 *
 * Pseudocode part 1
 *
 */
public class FindSumClosestToZero {
    public static void main(String[] arr){
        int[] arr1 = {1, 2, -1, -2, 3, 4, -3, -4};
        //find two elements whose sum is almost equal to zero
        Object[] arr2 = sumClosestToZero(arr1, arr1.length).toArray();
        System.out.println(Arrays.toString(arr2));
        Object[] arr3 = sumClosestToZero2(arr1, arr1.length).toArray();
        System.out.println(Arrays.toString(arr3));

    }

    public static ArrayList<Integer> sumClosestToZero(int[] arr, int size){
        int minSum = Math.abs(arr[0] + arr[1]);
        ArrayList<Integer> arr1 = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                sum = Math.abs(arr[i] + arr[j]);
                if (sum < minSum){
                    minSum = sum;
                    arr1.add(arr[i]);
                    arr1.add(arr[j]);
                }
            }
        }
        return arr1;
    }

    /*
    Second method

    - Get the first element as 0
    - Get the second element index as size -1
    - initialize the sum as first element and second element
    - if sum is less than minSum, return sum
    - if sum is greater than minSum, decrementj

     */

    public static ArrayList<Integer> sumClosestToZero2(int[] arr, int size){
        Arrays.sort(arr);
        ArrayList<Integer> arr1 = new ArrayList<>();
        int sum = 0;
        int l, r;
        int minFirst = 0;
        int minSecond =size -1;
        int minSum = Math.abs(arr[minFirst] + arr[minSecond]);
        for(l=0, r=size-1; l<r;){
            sum = Math.abs(arr[l] + arr[r]);
            if (Math.abs(sum) < minSum){
                minSum = sum;
                minFirst = l;
                minSecond = r;
                arr1.add(minFirst);
                arr1.add(minSecond);
            }
            if (sum < 0){
                l++;
            } else if (sum > 0){
                r++;
            } else {
                break;
            }
        }
        return arr1;
    }
}
