package chapter3;

/**
 * Created by SeleniumGuru.com on 4/8/18.
 */
public class ArraySel {
    private long[] a;
    private int nElems;

    public ArraySel(int max){
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public void display(){
        for(int j=0; j<nElems; j++){
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }

    public void selectionSort()
    {
        int out, in, min;

        for(out=0; out<nElems-1; out++)   // outer loop
        {
            min = out;                     // minimum
            for(in=out+1; in<nElems; in++) {// inner loop
                if (a[in] < a[min]) {   // if min greater,
                    min = in;   // we have a new min
                }
            }
            swap(out, min); // swap them
        }  // end for(out)
    }  // end selectionSort()


    public void swap(int one, int two){
        long temp = a[one]; //swap temp to first one
        a[one] = a[two];    //swap first one to two
        a[two] = temp;      //swap two to first one
    }
}
