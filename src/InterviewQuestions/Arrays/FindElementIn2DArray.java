package InterviewQuestions.Arrays;

/**
 * Created by Ashok Tulachan on 5/7/18.
 * [1,2],[3,4], [5,6]
 *
 * [[1 2]
 * [3 4]
 * [5, 6]]
 */
public class FindElementIn2DArray {
    public static void main(String[] args) {
        //2D Array
        int[][] arr = {{1,2}, {3, 4}, {5, 6}};
        //find element in 2d array
        System.out.println(findElementIn2DArray(arr,3, 2, 5));

    }

    public static int findElementIn2DArray(int[] arr[], int r, int col, int value){
        int row = 0;
        int column = col-1;
        while (row < r && column >=0){
            if (arr[row][column] == value){
                return arr[row][column];
            } else if (arr[row][column] > value) {
                column--;
            } else {
                row++;
            }
        }
        return 0;
    }
}
