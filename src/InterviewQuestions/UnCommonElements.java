package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by SeleniumGuru.com on 4/23/18.
 */
public class UnCommonElements {


    public static void main(String[] args){
        int[] array1A = {1, 3, 4, 6, 7, 9};
        int[] array2A = {1, 2, 4, 5, 9, 10};
        System.out.println(Arrays.toString(findUnCommonElements(array1A, array2A)));
    }


    //pseudo code

    public static Integer[] findUnCommonElements(int[] array1, int[] array2){
        //create new empty array
        //for loop in both array1 and array2
        //dump in new empty array if the elements match

        //First get common elements
        //Then for loop to add elements on the 1st array
        //Another for loop to add elements from the 2nd array
        ArrayList<Integer> finalArray = new ArrayList<>();
        ArrayList<Integer> unCommonArray = new ArrayList<>();
        Integer[] array3 = new Integer[finalArray.size()];
        for(int i=0; i < array1.length; i++){
            for(int j=0; j<array2.length; j++){
                if (array1[i] == array2[j]){
                    finalArray.add(array1[i]);
                }

            }
        }

        for(int k=0; k<array1.length; k++){
            if (!finalArray.contains(array1[k])){
                unCommonArray.add(array1[k]);
            }
        }

        for(int k=0; k<array2.length; k++){
            if (!finalArray.contains(array2[k])){
                unCommonArray.add(array2[k]);
            }
        }

//        return finalArray.toArray(array3);
        return unCommonArray.toArray(array3);
    }

}
