package InterviewQuestions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Ashok Tulachan on 5/7/18.
 */
public class FindCommonElements {
    public static void main(String[] args) {
        //arr
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 11, 15, 16, 17};
        int[] arr3 = {1, 7, 2, 5, 4};
        int[] arr4 = {1, 2, 11, 15, 22};
        //find if arr1 and arr2 are permutations of each other
        System.out.println(findCommonElements(arr1, arr2));
        System.out.println(findCommonElements(arr1, arr3));
        System.out.println(findCommonElements(arr1, arr4));
    }

    //find Common elements
    public static ArrayList<Integer> findCommonElements(int[] arr1, int[] arr2){
        int i, j;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> arr3 = new ArrayList<>();
        for(i=0; i<arr1.length; i++){
            for(j=0; j<arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr3.add(arr1[i]);
                }
            }
        }
        return arr3;
    }
}
