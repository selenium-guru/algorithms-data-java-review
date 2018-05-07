package InterviewQuestions.Arrays;

/**
 * Created by SeleniumGuru.com on 5/5/18.
 *
 *
 * Assumptions
 * Arrays not sorted
 * Duplicate elements or not
 *
 *
 * Pseudo code
 * Loop through the array
 * if nth index matches the number inside the array return array;
 */
public class SequentialSearch {
    public static void main(String[] args){
        //sample arr
        int[] arr = {1, 2, 4, 6, 8, 19};
        //sequential search
        System.out.println(sequentialSearch(arr, 6));
    }

    public static int sequentialSearch(int[] arr, int number){
        for(int i: arr){
            if (i == number){
                return i;
            }
        }
        return -1;
    }
}
