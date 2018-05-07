package InterviewQuestions.PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by SeleniumGuru.com on 5/5/18.
 */
public class FindMissingNumber {

    public static void main(String[] args){
        int[] iArray = new int[]{1, 2, 3, 5};
        int missing = getMissingNumber(iArray, 5);
        System.out.printf("Missing number in array %s is %d %n", Arrays.toString(iArray), missing);
    }

    private static int getMissingNumber(int[] numbers, int totalCount){
        int expectedSum=totalCount * ((totalCount) * (totalCount + 1) / 2);
        int sum = 0;
        //Get sum of numbers
        for(int i : numbers){
            sum += i;
        }

        return expectedSum - sum;
    }


}
