package InterviewQuestions.PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by SeleniumGuru.com on 5/5/18.
 *
 *
 * Assumptions
 * two arrays
 * sorted array or not? If not, can we sort them
 *
 * Psuedo code
 * sort the array
 * create a new array list
 * for loop in both arr1
 * Equate if arr1 is equal to arr2, then put it in new arraylist
 * Intersection
 *
 */
public class IntersectionOfTwoArrays {
    public static void main(String[] args){
        //two arrays
        int[] arr1 = {1, 2, 3, 4, 6};
        int[] arr2 = {4, 2, 1, 1, 2};

        //find intersection of an array
        System.out.println(findIntersection(arr1, arr2));
    }

    public static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2){
        ArrayList<Integer> intersectArray = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //for loop
        for (int i: arr1){
            for (int j: arr2){
                if (i == j && !intersectArray.contains(i)) {
                    intersectArray.add(i);
                }
            }
        }
        return intersectArray;
    }


}
