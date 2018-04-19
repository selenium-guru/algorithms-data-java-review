package chapter12;

/**
 * Created by SeleniumGuru.com on 4/19/18.
 */
/*************************************************************************
 *       Demonstrates working with Sets and Maps
 *
 *************************************************************************/

import java.util.*;

public class SetMapDemo
{
    public static void main(String[] args)
    {
        String[] data = new String("nothing is as easy as it looks").split(" ");

        HashSet<String> hs = new HashSet<String>();  //Unique elements
        LinkedHashSet<String> lhs = new LinkedHashSet<String>(); //Ordered Unique elements
        TreeSet<String> ts = new TreeSet<String>(); //Unordered Unique elements

        HashMap<String, Integer> m = new HashMap<String, Integer>(); //Map with unique elements
        TreeMap<String, Integer> tm = new TreeMap<String, Integer>(); //Map with binary tree structures
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();

        for (String x : data)
        {
            Integer freq = m.get(x);
            System.out.println("Frequencey: " + freq);
            m.put(x, freq == null ? 1 : freq + 1);
            tm.put(x, freq == null ? 1 : freq + 1);
            lhm.put(x, freq == null ? 1 : freq + 1);

            hs.add(x);
            ts.add(x);
            lhs.add(x);
        }

        /* this prints the HashSet */
        System.out.println("Hash  set: " + hs);
        System.out.println();

        /* this prints the hashtable in sorted order*/
        System.out.println("Tree set: " + ts);
        System.out.println();

        /* this prints the hashtable in the order items were inserted */
        System.out.println("Linked set: " + lhs);
        System.out.println();

        System.out.println(m.size() + " distinct words detected:");
        System.out.println();

        System.out.println("Hash map: " + m);
        System.out.println();

        System.out.println("Tree map: " + tm);
        System.out.println();

        System.out.println("Linked map: " + lhm);
        System.out.println();
    }
}

