package InterviewQuestions.Arrays;

/**
 * Created by SeleniumGuru.com on 5/5/18.
 */
public class SumOfElements {
    public static void main(String[] args){
        //sample arr;
        int[] arr = {1,2,3,4,5};

        //sum of elements
        System.out.println(findSum(arr));
    }

    public static int findSum(int[] arr){
        int sum =0;
        for(int i: arr){
            sum += i;
        }
        return sum;
    }
}
