package chapter2;

/**
 * Created by SeleniumGuru.com on 4/6/18.
 */
public class OrdArray {
    private long[] a;
    private int nElems;

    public OrdArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    //get value
    public long getElem(int index){
        return a[index];
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while(true) {
            curIn = (upperBound + lowerBound) / 2;
            if (a[curIn] == searchKey)
                return curIn;
            else if (lowerBound > upperBound) {
                return nElems;
            } else {
                if (a[curIn] < searchKey) {
                    lowerBound = curIn + 1; // it's in upperhalf
                } else {

                    upperBound = curIn - 1; // it's in lower half
                }
            }
        }

    }

    public void insert(long value) {
        int j;
        for(j=0; j<nElems; j++) {
            if (a[j] > value) {
                break;
            }
        }
            //move bigger ones up
        for(int k = nElems; k > j; k--){
                a[k] = a[k-1];
        }
        a[j]= value; //insert it
        nElems++; //increment size
    }

    //insert value
//    public void insert(long value){
//        a[nElems] = value; //insert it
//        nElems++;  //increment size
//    }

    public boolean delete(long value) {
        int j = find(value);
        if (j == nElems){
            return false;
        } else {
            //move bigger ones down
            for(int k=j; k<nElems; k++){
                a[k] = a[k+1];

            }
            nElems--;
            return true;
        }
    }




    //display
    public void display() {
        for(int j=0; j<nElems; j++){
            System.out.print(a[j] + " ");
        }
        System.out.print("");


    }

}
