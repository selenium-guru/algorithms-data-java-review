package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by SeleniumGuru.com on 4/23/18.
 */
public class findMaxOccurenceCount {
    public static void main(String[] args){
        int[] list = new int[]{1,3,1,3,2,2,1,4};
        //Sort the list
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.println(maxCount(list));
    }

    public static Integer maxCount(int[] givenArray){
        int maxCount = -1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i: givenArray){
            if (map.containsKey(i)){
                Integer newVal = map.get(i) + 1;
                map.put(i, newVal);
            } else {
                map.put(i,1);
            }
            if (map.get(i) > maxCount){
                maxCount = map.get(i);
            }

        }
        return maxCount;
    }
}
