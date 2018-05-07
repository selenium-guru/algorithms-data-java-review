package InterviewQuestions.Arrays;

import java.util.Arrays;

/**
 * Created by SeleniumGuru.com on 5/6/18.
 *
 *
 * Array - duplicate or not?
 * Sorted Arrays - yes
 *
 * Pseudo code
 * Sort the array first
 * get the start position of the array - start of the element
 * get the end position of the array - end of the element
 * Loop throughout the array
 * Now swap first element with the last
 */
public class ReverseArray {
    public static void main(String[] args){
        //sample arr
        int[] arr = {1, 2, 3, 4, 5, 6};

        //reverse of the array
        int[] finalArr = reverseOfArray(arr, 0, arr.length-1);
        System.out.print(Arrays.toString(finalArr));
    }

    public static int[] reverseOfArray(int[] arr, int start, int end){
        for(int i=start, j=end; i<j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
