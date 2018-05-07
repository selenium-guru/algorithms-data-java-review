package TwoDimensionalArray;

import java.util.Arrays;

/**
 * Created by SeleniumGuru.com on 5/5/18.
 */
public class TwoD {

    public static void main(String[] args){
        System.out.println(twoDArrayExample());
    }
    public static int[][] twoDArrayExample(){
        int[][] arr = new int[4][2];
        int count = 0;
        for (int i=0; i < 4; i++){
            for(int j=0; j<2; j++){
                arr[i][j] = count++;
            }
        }
        return arr;
    }

    public static void print2DArray(int[][] arr, int row, int col){
        for (int i=0; i<row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(" " + arr[i][j]);
            }
        }

    }
}
