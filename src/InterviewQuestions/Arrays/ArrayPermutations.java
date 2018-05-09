package InterviewQuestions.Arrays;

import java.util.Arrays;

/**
 * Created by Ashok Tulachan on 5/7/18.
 */

public class ArrayPermutations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        permute(arr, 0, arr.length - 1);
    }

    static void permute(int[] arr, int i, int n) {
        int j;
        if (i == n)
            System.out.println(Arrays.toString(arr));
        else {
            for (j = i; j <= n; j++) {
                swap(arr, i, j);
                permute(arr, i + 1, n);
                swap(arr, i, j); // backtrack
            }
        }
    }


    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}



