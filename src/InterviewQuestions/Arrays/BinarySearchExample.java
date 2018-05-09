package InterviewQuestions.Arrays;

import java.util.Arrays;

/**
 * Created by Ashok Tulachan on 5/8/18.
 */
public class BinarySearchExample {
    public static void main(String[] args) {
        //sample arr
        int[] arr = {1, 3, 2, 4, 5, 7};
        //search the value using binary search
        System.out.println(findValueUsingBinarySearch(arr, arr.length, 5));

    }

    public static int findValueUsingBinarySearch(int[] arr, int size, int value){
        int low = 0;
        int high = size-1;

        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++){
            int mid = (low + high)/2;
            if (value == arr[mid]){
                return arr[mid];
            } else if (value < arr[mid]){
                low +=1;
            } else {
                high -=1;
            }
        }
        return value;
    }
}
