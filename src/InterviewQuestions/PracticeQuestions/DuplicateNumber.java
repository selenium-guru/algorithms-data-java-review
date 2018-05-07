package InterviewQuestions.PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by SeleniumGuru.com on 5/5/18.
 */
public class DuplicateNumber {
    public static void main(String[] args){
        //
        int[] arr = {1, 2, 2, 3, 3, 4, 6};
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> duplicateArr = new ArrayList<Integer>();
        int maxCount = 0;
        int maxItem = arr[0];
        Arrays.sort(arr);
        //compare element in array with empty hashmap
        for(int i: arr){
            if (map.containsKey(i)){
                int newValue = map.get(i) + 1;
                map.put(i, newValue);
            } else {
                map.put(i, 1);
            }

            if (map.get(i) > maxCount){
                maxCount = map.get(i);
                maxItem = i;
            }

        }

        System.out.println(map);
        System.out.println(maxCount);
        System.out.println(maxItem);
    }

}
