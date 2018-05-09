package InterviewQuestions.Arrays;

import java.util.Arrays;

/**
 * Created by Ashok Tulachan on 5/7/18.
 */

public class StringPermutations {
    public static void main(String[] args) {
        String word = "ABCDEFGH";

        char[] arr = word.toCharArray();

        permute(arr, 0, arr.length - 1);
    }

    static void permute(char[] arr, int i, int n) {
        if (i == n)
            System.out.println(Arrays.toString(arr));
        else {
            for (int j = i; j <= n; j++) {
                swap(arr, i, j);
                permute(arr, i + 1, n);
                swap(arr, i, j); // backtrack
            }
        }
    }

    //1,2,3,4
    //1st iteration i = 0, j = 0;
    //swap nothing changes
    //permuate with i+1
    //2nd iteration i = 1, j = 1;
    //swap - i = 1,




    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}



