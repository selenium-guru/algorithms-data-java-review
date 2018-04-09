package chapter3;

/**
 * Created by SeleniumGuru.com on 4/8/18.
 */
public class ArrayIns {
    private long[] a;       //ref to array a
    private int nElems;     // no of data items

    public ArrayIns(int max){
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public void display(){
        for (int j=0; j<nElems; j++){
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }


    public void insertionSort() {
        int in, out;
        for(out=1; out<nElems; out++){  //out is dividing line
            long temp = a[out];     //remove marked item
            in = out;
            while (in > 0 && a[in-1] >= temp) { //until one is smaller
                a[in] = a[in-1]; //shift item to right
                --in;           //go left one position
            }
            a[in] = temp;
        }
    }


}
