package chapter3;

import java.util.Random;

/**
 * Created by SeleniumGuru.com on 4/8/18.
 */
public class SelectSortApp {
    public static void main(String[] args){
        int maxSize = 100;
        ArraySel arr = new ArraySel(maxSize);

        //insert 100 random elements
//        Random rand = new Random();
//        for(int i=0; i<100; i++){
//            System.out.println(rand.nextInt(100));
//            arr.insert(rand.nextInt(100));
//        }
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display(); //display items

        arr.selectionSort(); //sort items
        arr.display();


    }
}
