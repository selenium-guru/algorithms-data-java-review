package toptals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by SeleniumGuru.com on 4/20/18.
 */
public class combination {

 //   public static void main(String[] args){

//        int n = 2;
//        int[] saladShopArr = {29, 50};
//        int[] totalPizzaArray = {61, 37};
//        int[] totalCakeRestArray = {37,70};
//        int[] finalArray = new int[2];
//
//        //Merge array and get combinations
//        merge(saladShopArr, totalPizzaArray, totalCakeRestArray, finalArray, n);
//        display(finalArray, 2);
//
//        String[] s1 = new String[]{"a", "b", "c"};
//        String[] s2 = new String[]{"d", "e", "f"};
//
//        String[] result = ArrayUtils.addAll(s1, s2);
//
//        System.out.println(Arrays.toString(result));
//
//        int [] int1 = new int[]{1,2,3};
//        int[] int2 = new int[]{4,5,6};
//
//        int[] result2 = ArrayUtils.addAll(int1, int2);
//
//        System.out.println(Arrays.toString(result2));

//    }
//
//    public static void merge(int[] arrayA, int[] arrayB,
//                             int[] arrayC, int[] arrayD, int size) {
//       List<Integer> list1 = Arrays.asList(arrayA);
//       List<Integer> list2 = Arrays.asList(arrayB);
//       List<Integer>
//    }
//
//    public static int[] merge(int[]... arrays){
//        List<Integer> list = new ArrayList<>();
//        for(int[] array: arrays){
//            Collections.addAll(list, (T) array);
//        }
//
//    }

    public static void main(String[] args){
        int[][] combinations = new int[][] {
                new int[] { 29, 50 },
                new int[] { 61, 37 },
                new int[] { 37, 70 }};

        int[] indices = new int[combinations.length];

        int currentIndex = indices.length - 1;
        outerProcess: while (true) {

            for (int i = 0; i < combinations.length; i++) {
                System.out.print(combinations[i][indices[i]] + ", ");
            }
            System.out.println();

            while (true) {
                // Increase current index
                indices[currentIndex]++;
                // If index too big, set itself and everything right of it to 0 and move left
                if (indices[currentIndex] >= combinations[currentIndex].length) {
                    for (int j = currentIndex; j < indices.length; j++) {
                        indices[j] = 0;
                    }
                    currentIndex--;
                } else {
                    // If index is allowed, move as far right as possible and process next
                    // combination
                    while (currentIndex < indices.length - 1) {
                        currentIndex++;
                    }
                    break;
                }
                // If we cannot move left anymore, we're finished
                if (currentIndex == -1) {
                    break outerProcess;
                }
            }
        }
    }


//    public static void display(int[] theArray, int size){
//        for(int j=0; j<size; j++){
//            System.out.print(theArray[j] + " ");
//        }
//        System.out.println("");
//    }

}
