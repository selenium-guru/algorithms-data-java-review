package chapter5;

/**
 * Created by SeleniumGuru.com on 4/11/18.
 */
public class FindBinaryNumber {
    public static void main(String[] args) {
        System.out.println(solution(2000));
        System.out.println(solution(1041));
    }

    public static int solution(int N) {
        int binaryGap = 0;
        String sInput = Integer.toBinaryString(N);
        int input = sInput.length();
        int sLength = 0;
        for (int i = 0; i < input; i++) {
            String ch = String.valueOf(sInput.charAt(i));
            if (ch.equals("0")) {  //increment sLength for 0
                sLength++;
            }
            if (ch.equals("1")) {  //check to see if you get 1
                if (sLength > binaryGap) {  //assign binaryGap with sLength if it is greater than binaryGap
                    binaryGap = sLength;
                }
                sLength = 0; // initialize sLength to 0 after seeing 1 again
            }
        }
        return binaryGap;
    }
}
