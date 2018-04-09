package chapter2;

/**
 * Created by SeleniumGuru.com on 4/6/18.
 */
public class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max){
        a = new long[max];      //create array
        nElems = 0;             //no items yet
    }

    public boolean find(long searchKey){
        int j;
        for(j=0; j<nElems; j++){
            if(a[j] == searchKey){
                break;
            }
        }
        if (j == nElems)
            return false;
        else
            return true;
    }

    //insert value
    public void insert(long value){
        a[nElems] = value; //insert it
        nElems++;  //increment size
    }

    //get max
    public long getMax(){
        int j;
        long max = a[0];
        for(j=0; j<nElems; j++){
            if (a[j] > max){
                max = a[j];
            }
        }
        return max;
    }



    //delete value
    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) {  //find the index for the element with that value
            if (value == a[j]) {
                break;
            }
        }
        if (j == nElems)
            return false;
        else {
            for (int k = j; k < nElems; k++) {
                a[k] = a[k + 1];
            }
            nElems--;
            return true;
        }
    }



    //remove max
    public boolean removeMax(long max) {
        long j = getMax();
        for(int k =0; k < nElems; k++){
            if (a[k] == j){
                a[k] = a[k+1];
            }
        }
        nElems--;
        return true;

    }


    //display
    public void display() {
        for(int j=0; j<nElems; j++){
            System.out.print(a[j] + " ");
        }
        System.out.print("");


    }


}
