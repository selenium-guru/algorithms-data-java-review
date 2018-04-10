package chapter4;

/**
 * Created by SeleniumGuru.com on 4/10/18.
 */
class PriorityQT {
    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PriorityQT(int s){
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item){
        int j;
        if (nItems == 0){   // if no items
            queArray[nItems++] = item; //insert at 0
        } else {
            for (j = nItems - 1; j >= 0; j--) //starts at end {
                if (item > queArray[j]) {
                    queArray[j + 1] = queArray[j]; //shift upward
                } else {
                    break;      //done shifting
                }
            queArray[j + 1] = item; //insert it
            nItems++;

        }

    }

    public long remove() {
        return queArray[--nItems];
    }

    public long peekMin() {
        return queArray[nItems-1];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }



}

public class PriorityQTApp {
    public static void main(String[] args){
        long[] notSortedArray = new long[]{110,45,50,40,10,20,30,60};
        PriorityQT thePQ = new PriorityQT(notSortedArray.length);
        long[] sortedArray = new long[notSortedArray.length];
        //for loop
        for(int j=0; j<notSortedArray.length; j++){
            thePQ.insert(notSortedArray[j]);
        }

        System.out.println("The minimum is: " +thePQ.peekMin());

        while(!thePQ.isEmpty()){
            for(int k=0; k<notSortedArray.length; k++) {
                long item = thePQ.remove();
                sortedArray[k] = item;
                //System.out.print(item + " ");
            }

        }

        System.out.println("");
        for(int l=0; l<sortedArray.length; l++){
            System.out.print(sortedArray[l] + " ");
        }
    }
}
