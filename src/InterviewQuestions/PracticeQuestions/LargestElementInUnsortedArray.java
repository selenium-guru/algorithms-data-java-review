package InterviewQuestions.PracticeQuestions;

/**
 * Created by SeleniumGuru.com on 5/5/18.
 */

/*
Assumptions

- integer array
- is duplicate allowed?
- is element sorted or not
- Can we sort the array

pseudo code

- create an array
- initialize the largest element as the first element
- loop and replace the largest element if the nth index value is greater than the largest element
- return the largest element


 */
public class LargestElementInUnsortedArray {
    public static void main(String[] args){
        //sample arr
        int[] arr= {1, 2, 4, 9, 4, 7};
        //find the largest element

        System.out.println(findLargestElement(arr));

    }

    private static int findLargestElement(int[] arr){
        int largestElement = arr[0];
        for (int i: arr){
            if (i > largestElement){
                largestElement = i;
            }
        }
        return largestElement;
    }
}
