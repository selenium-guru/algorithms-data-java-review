package chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by SeleniumGuru.com on 4/14/18.
 */
public class factorial {

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number for factorial: " );
        int theNumber = getInt();
        System.out.println("Factorial is: " + factorial(theNumber));
    }

    public static int factorial(int n){
        if (n == 0){
            return 1;
        } else {
            int fact = n*factorial(n-1);
            return fact;
        }
    }


    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
