package InterviewQuestions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by SeleniumGuru.com on 4/21/18.
 */
public class findSumOfAllElements {

    public static void main(String[] args){
        int[] myArr = {11, 4, 1, 7, 5,9,4};
        System.out.println("Max element in array is: " + findMax(myArr));
        System.out.println("Min element in array is: " + findMin(myArr));
        System.out.println("Even element in array is: " + findEvenNumber(myArr));
        System.out.println("Non Duplicate element in array is: " + findNonDuplicate(myArr));
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i=0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                arr[i] = max;
            }
        }
        return max;
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i=0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                arr[i] = min;
            }
        }
        return min;
    }


    public static Stack<Integer> findEvenNumber(int[] arr){
        Stack<Integer> evenNumber = new Stack<Integer>();
        for(int i=0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                System.out.println("It is even");
                evenNumber.push(arr[i]);
            } else {
                System.out.println("It is odd");
            }
        }
        return evenNumber;
    }

    //Find non duplicate
    public static Set<Integer> findNonDuplicate(int[] arr){
        Set<Integer> link = new HashSet<Integer>();
        for(int i=0; i<arr.length; i++){
            link.add(arr[i]);
        }
        return link;
    }

}
