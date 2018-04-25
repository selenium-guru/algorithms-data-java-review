package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 * Created by SeleniumGuru.com on 4/23/18.
 */
public class CommonElements {


    public static void main(String[] args){
        int[] array1A = {1, 3, 4, 6, 7, 9};
        int[] array2A = {1, 2, 4, 5, 9, 10};
        System.out.println(Arrays.toString(findCommonElements2(array1A, array2A)));
    }

//    public static Integer[] findCommonElements(int[] array1, int[] array2){
//        //create new empty array
//        //for loop in both array1 and array2
//        //dump in new empty array if the elements match
//
//        ArrayList<Integer> finalArray = new ArrayList();
//        Integer[] array3 = new Integer[finalArray.size()];
//        int p1 =0;
//        int p2 = 0;
//        //ArrayList<Integer> arr1 = new ArrayList<>();
//        //Integer[] finalArray = {};
//        while (p1 < array1.length && p2 < array2.length){
//           if (array1[p1] == array2[p2]){
//               finalArray.add(array1[p1]);
//               p1+=1;
//               p2+=1;
//           }
//           else if (array1[p1] > array2[p2]){
//               p2+=1;
//           }
//           else {
//               p1+=1;
//           }
//
//        }
//
//        return finalArray.toArray(array3);
//    }


    //pseudo code

    public static Integer[] findCommonElements2(int[] array1, int[] array2){
        //create new empty array
        //for loop in both array1 and array2
        //dump in new empty array if the elements match

        ArrayList<Integer> finalArray = new ArrayList();
        Integer[] array3 = new Integer[finalArray.size()];
        for(int i=0; i < array1.length; i++){
            for(int j=0; j<array2.length; j++){
                if (array1[i] == array2[j]){
                    finalArray.add(array1[i]);
                }
            }
        }

        return finalArray.toArray(array3);
    }

}
