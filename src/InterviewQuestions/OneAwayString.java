package InterviewQuestions;

/**
 * Created by SeleniumGuru.com on 4/25/18.
 */
public class OneAwayString {
    public static void main(String[] args){
        String s1 = "abcdkl";
        String s2 = "abcdefg";
        String s3 = "abcdg";
        String s4 = "abcfg";
        String s5 = "abcde";
        String s6 = "abde";

        //if s1 and s2 are more than one string away return false
        System.out.println(oneAwayString(s1,s2));

        //if s1 and s2 are same length but different character
        System.out.println(oneAwayString(s3,s4));

        //if s1 has one more character than s2
        System.out.println(oneAwayString(s5, s6));


    }

    //if both strings are same length
    public static boolean oneAwaySameLength(String s1, String s2){
        int diff = 0;
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        for(int i=0; i<s1Array.length; i++){
            if (s1Array[i] != s2Array[i]){
                diff += 1;
            }
            if (diff > 1){
                return false;
            }
        }
        return true;
    }


    //if both string are different length
    public static boolean oneAwayDiffLength(String s1, String s2){
        int i=0;
        int diff = 0;
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        while (i < s2Array.length){
            if (s1Array[i + diff] == s2Array[i]){
                i+= 1;
            } else {
                diff +=1;
                if (diff > 1){
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean oneAwayString(String s1, String s2){
        if (s1.length() - s2.length() >= 2 || s2.length() - s1.length() >= 2){
            return false;
        } else if (s1.length() == s2.length()) {
            return oneAwaySameLength(s1, s2);
        } else if (s1.length() > s2.length()) {
            return oneAwayDiffLength(s1, s2);
        } else {
            return oneAwayDiffLength(s2, s1);
        }
    }
}
