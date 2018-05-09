package InterviewQuestions.Arrays;

import java.util.Arrays;

/**
 * Created by SeleniumGuru.com on 5/7/18.
 *
 * How would you swap elements of an array like [a1 a2 a3 a4 b1 b2 b3 b4]
 * to convert it into [a1 b1 a2 b2 a3 b3 a4 b4]?

 */
public class TransformArray {
    public static void main(String[] args){
        //arr
        String[] arr = {"a1", "a2", "a3", "a4", "b1", "b2", "b3", "b4"};
        //expected
        //String[] arr2 = {"a1", "b1", "a2", "b2", "a3", "b3", "a4", "b4"};
        System.out.println(Arrays.toString(transformArrayAB1(arr, arr.length)));
    }

    public static String[] transformArrayAB1(String[] arr, int size){
        int N = size/2, i, j;
        for(i = 1; i < N; i++){
            for(j=0; j<i; j++){
                swap(arr, N-i+2*j, N-i+2*j+1);
            }
        }
        return arr;
    }

    public static void swap(String[] arr, int a, int b){
        String temp = arr[a];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
