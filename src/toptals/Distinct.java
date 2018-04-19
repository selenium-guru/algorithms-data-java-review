package toptals;

/**
 * Created by SeleniumGuru.com on 4/19/18.
 */
import java.util.Arrays;

public class Distinct {
    public static void main (String[] args) {
        int[] A = new int[] {2,1,1,2,3,1};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int dupl=0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i-1])
                dupl++;
        }
        return A.length - dupl;
    }
}