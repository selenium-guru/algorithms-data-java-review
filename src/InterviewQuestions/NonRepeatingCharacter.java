package InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by SeleniumGuru.com on 4/24/18.
 */
public class NonRepeatingCharacter {
    public static void main(String[] args){
        System.out.println(nonRepeating("abcab")); // should return 'c'
        System.out.println(nonRepeating("abab")); // should return null
        System.out.println(nonRepeating("aabbbc")); // should return 'c'
        System.out.println(nonRepeating("aabbdbc")); // should return 'd'
    }

    public static Character nonRepeating(String s){
        //split into hashmap
        //get character and increment 1 for every addition and put it in value
        //return if character value is 1.
        //return null if no match

        ArrayList<Character> arr1 = new ArrayList<Character>();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            arr1.add(s.charAt(i));
        }
        System.out.println(arr1);

        for(char i: arr1){
            if (map.containsKey(i)){
                Integer newVal = map.get(i) + 1;
                map.put(i, newVal);
            } else {
                map.put(i,1);
            }
        }

        for (char c: s.toCharArray()){
            if (map.get(c) == 1){
                return c;
            }
        }

        return null;

    }


    public static <T, E> T getKeyByValue (Map<T, E> map, E value){
        for (Map.Entry<T, E> entry : map.entrySet()) {

            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
