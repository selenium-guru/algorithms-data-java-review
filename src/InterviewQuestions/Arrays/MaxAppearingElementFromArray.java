package InterviewQuestions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by SeleniumGuru.com on 5/6/18.
 *
 *
 * 1st method
 * for loop for i
 * for loop for j
 * count = 1;
 * count++;
 * max = 1
 */
public class MaxAppearingElementFromArray {
    public static void main(String[] args){
        //sample arr
        int[] arr = {1,2,3,2,2,5,5,9};
        //find max element
        System.out.println(findMaxElement1(arr));
        System.out.println(findMaxElement2(arr));
    }

    public static int findMaxElement1(int[] arr){
        int count = 1;
        int max = arr[0];
        int maxCount = 1;
        for (int i=0; i < arr.length; i++){
            count = 1;
            for (int j=0; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }

            if (count > maxCount){
                maxCount = count;
                max = arr[i];
            }
        }
        return max;
    }

    //Pseudocode
    //if the array is sorted
    //Initialize max count = 1;
    //Initialize current count = 1
    //Initialize max element as first element
    //Initialize curr element as first element
    //Equate curr element as max element if currCount > maxCount
    //o(n) time complexity
    public static int findMaxElement2(int[] arr){
        Arrays.sort(arr);
        int maxCount = 1;
        int max = arr[0];
        int currCount = 1;
        int curr = arr[0];

        for(int i=1; i<arr.length;i++){
            if (arr[i-1] == arr[i]){
                currCount++;
            } else {
                currCount = 1;
                curr = arr[i];
            }

            if (currCount > maxCount){
                maxCount = currCount;
                max = curr;
            }

        }

        return max;
    }

}
