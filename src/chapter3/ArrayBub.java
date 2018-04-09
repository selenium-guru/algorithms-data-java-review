package chapter3;

/**
 * Created by SeleniumGuru.com on 4/8/18.
 */
class ArrayBub {
    private long[] a;
    private int nElems;

    public ArrayBub(int max){
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


    public void bubbleSort() {
        int out, in;
        for (out = nElems - 1; out > 1; out--) {//outer loop backward
            for (in = 0; in < out; in++) { //inner loop forward
                if (a[in] > a[in + 1]) { //?out of order
                    swap(in, in + 1); //swap them
                }
            }
        }
    }

    private void swap(int one, int two){
        long temp = a[one]; //swap temp to first one
        a[one] = a[two];  //swap first to two
        a[two] = temp; //swap two to first one
    }
}
