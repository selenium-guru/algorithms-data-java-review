package toptals;

/**
 * Created by SeleniumGuru.com on 4/20/18.
 */
// Java program to find N
// maximum combinations
// from two arrays,
import java.io.*;
import java.util.*;

class GFG {

    // function to display first N
    // maximum sum combinations
    static int NMaxCombinations(int A[], int B[], int N,
                                 int K)
    {
        // max heap.
        PriorityQueue<Integer> pq =
                new PriorityQueue<Integer>(Collections.reverseOrder());

        // insert all the possible
        // combinations in max heap.
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                pq.add(A[i] + B[j]);

        // pop first N elements
        // from max heap and
        // display them.
        int count = 0;

        while (count < K)
        {
            System.out.println(pq.peek());
            pq.remove();
            count++;
        }
        return count;
    }

    public static void main (String[] args)
    {
        int A[] = { 29, 50 };
        int B[] = { 61,37};

        int N = A.length;
        int K = 3;

        System.out.println(NMaxCombinations(A, B, N, K));

    }
}