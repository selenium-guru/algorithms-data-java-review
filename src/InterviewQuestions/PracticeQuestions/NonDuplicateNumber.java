package InterviewQuestions.PracticeQuestions;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by SeleniumGuru.com on 5/5/18.
 */
public class NonDuplicateNumber {
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 3, 4, 6};

        //find non duplicate number
        System.out.println(findNonDuplicateNumbers(arr));
    }

    private static ArrayList<Integer> findNonDuplicateNumbers(int[] arr){
        ArrayList<Integer> nonDupArray = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i: arr){
            if (map.containsKey(i)){
                int newValue = map.get(i) + 1;
                map.put(i, newValue);
            } else {
                map.put(i, 1);
                nonDupArray.add(i);
            }
        }
        return nonDupArray;

    }
}
