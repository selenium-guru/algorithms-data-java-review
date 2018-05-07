package InterviewQuestions.Arrays;

import java.util.Arrays;

/**
 * Created by SeleniumGuru.com on 5/5/18.
 *
 * Rotate first element of array
 * Rotate another element of an array
 *
 */
public class ArrayRotation {
    public static void main(String[] args){
        //Sample arr
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //Reverse array
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rotateArray(arr, arr.length, 2)));
        //Rotate array

    }

    public static int[] rotateArray(int[] a, int n , int k){
        //reverseArray(a, 0, k-1); //rotate until that position
        //reverseArray(a, k, n-1); // now from that last position until end of the array
        reverseArray(a, 0, n-1); //now rotate whole array
        return a;
    }

    public static void reverseArray(int[] a, int start, int end){
        for (int i=start, j=end; i<j; i++, j--){
            int temp = a[i];
            a[i] = a[j];
            a[j]= temp;
        }

    }
}
