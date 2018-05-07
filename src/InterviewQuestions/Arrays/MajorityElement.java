package InterviewQuestions.Arrays;

/**
 * Created by SeleniumGuru.com on 5/6/18.
 *
 *
 * Assumptions
 * non sorted array
 * integer with numbers
 * duplicate numbers
 *
 * pseudo code
 * initialize count as 1
 * intialize majority element as arr[0]
 * for loop for i
 * for loop for j
 * if count > n/2, return the array element
 *
 */
public class MajorityElement {
    public static void main(String[] args){
        //sample arr
        int[] arr = {1, 2, 2, 3, 4, 5, 6, 7};
        //
        System.out.println(findMajorityElement(arr, arr.length));
    }

    public static int findMajorityElement(int[] arr, int size){
        int maxCount = 0;
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }

            if (count > maxCount) {
                max = arr[i];
                maxCount = count;
            }
        }

        if (maxCount > (size/2)){
            return max;
        } else {
            return Integer.MIN_VALUE;
        }

    }
}
