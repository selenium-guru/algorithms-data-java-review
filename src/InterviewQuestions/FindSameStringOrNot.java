package InterviewQuestions;

/**
 * Created by SeleniumGuru.com on 4/25/18.
 */
public class FindSameStringOrNot {
    public static void main(String[] args){
        String s1 = "abcdkl";
        String s2 = "abcdefg";
        String s3 = "abcdkl";


        //if s1 and s2 are more than one string away return false
        System.out.println(AreBothStringSame(s1,s2));
        System.out.println(AreBothStringSame(s1,s3));
    }

    //if both strings are same length
    public static boolean AreSameStrings(String s1, String s2){
        int diff = 0;
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        for(int i=0; i<s1Array.length; i++){
            if (s1Array[i] != s2Array[i]){
                return false;
            }
        }
        return true;
    }


    public static boolean AreBothStringSame(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        } else {
            return AreSameStrings(s1, s2);
        }
    }
}
