package InterviewQuestions.Arrays;

/**
 * Created by SeleniumGuru.com on 5/5/18.
 *
 *
 * Assumptions
 * Sorted Array
 * Duplicate elements or not
 *
 *
 * Pseudo code
 * Loop through the array
 * if nth index matches the number inside the array return array;
 */
public class BinarySearch {
    public static void main(String[] args){
        //sample arr
        int[] arr = {1, 2, 4, 6, 8, 19};
        //sequential search
        System.out.println(binarySearch(arr, arr.length, 6));
    }

    public static int binarySearch(int[] arr, int size,  int number){
        int low = 0;
        int mid;
        int high = size - 1;
        while (low <= high){
            mid = (high + low)/2;
            if (arr[mid] == number){
                return arr[mid];
            } else if (arr[mid] < number){
                low = low + 1;
            } else {
                high = high + 1;
            }
        }
        return -1;
    }
}
