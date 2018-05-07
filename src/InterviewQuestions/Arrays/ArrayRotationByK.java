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
public class ArrayRotationByK {
    public static void main(String[] args){
        //sample arr
        int[] arr = {1, 2, 3, 4, 5, 6};

        //reverse of the array
//        int[] finalArr = reverseOfArray(arr, 0, arr.length-1);
        System.out.print(Arrays.toString(rotateArray(arr, arr.length, 2)));
    }

    public static int[] rotateArray(int[] arr, int n, int k){
        reverseOfArray(arr, 0, k-1);
        reverseOfArray(arr, k, n-1);
        reverseOfArray(arr, 0, n-1);
        return arr;
    }

    public static void reverseOfArray(int[] arr, int start, int end){
        for(int i=start, j=end; i<j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
