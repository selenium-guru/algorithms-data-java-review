package chapter2;

/**
 * Created by SeleniumGuru.com on 4/6/18.
 */
public class LowArray {
    private long[] a; //ref to array a
    public LowArray(int size){ //constructor
        a = new long[size]; //create array
    }

    //set value
    public void setElem(int index, long value){
        a[index] = value;
    }

    //get value
    public long getElem(int index){
        return a[index];
    }


}
