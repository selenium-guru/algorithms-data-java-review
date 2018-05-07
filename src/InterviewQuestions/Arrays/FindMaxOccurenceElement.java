package InterviewQuestions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by SeleniumGuru.com on 5/6/18.
 */
public class FindMaxOccurenceElement {

    public static void main(String[] args){
        //sample array
        int[] arr = {1,2,2,2,2,3,3,4,4};
        //find the max occurence
        System.out.println(findMaxOccurence(arr, arr.length));
    }


    public static int findMaxOccurence(int[] arr, int size) {
        Arrays.sort(arr);
        ArrayList<Integer> arr1 = new ArrayList<>();
        int count=0;
        int maxCount = 1;
        int maxOccurenceElement = arr[0];
        for (int i=1; i<size; i++){
            if (arr[i-1] == arr[i]){
                 count++;
            } else {
                count = 1;
            }

            if (count > maxCount){
                maxCount = count;
                maxOccurenceElement = arr[i];
            }
        }
        return maxOccurenceElement;
    }
}
