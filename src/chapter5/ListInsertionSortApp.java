package chapter5;

/**
 * Created by SeleniumGuru.com on 4/10/18.
 */

class Link7 {
    public long dData; //data item(key)
    public Link7 next; //next link in list

    public Link7(long d){
        dData = d;
    }

    public void displayLink() { //display ourself
        System.out.print(dData + " ");
    }
}

class SortedList2 {
    private Link7 first;

    public SortedList2()  {  //constructor
        first = null;
    }

    public SortedList2(Link7[] linkArr) {  //constructor
        first = null;
        for(int j=0; j<linkArr.length; j++) { //copy array
            insert(linkArr[j]);
        }
    }

    public boolean isEmpty() {      //true if list is empty;
        return (first == null);
    }

    public void insert(Link7 k){
       Link7 previous = null;
       Link7 current = first;

       while (current != null && k.dData > current.dData) {
           previous = current;
           current = current.next; //go to next item
       }
       if (previous == null) {
           first = k;     //first ..> newlinkk
       } else {
           previous.next = k; //old prev --> newlink
       }
       k.next = current; //newLink ..> old current
    }

    public Link7 remove() {
        Link7 temp = first; //save first
        first = first.next; //delete first
        return temp; //return value;
    }
    
 }


public class ListInsertionSortApp {
    public static void main(String[] args) {
      int size = 10;

      Link7[] linkArray = new Link7[size];
      for(int j=0; j<size; j++){
          int n = (int)(java.lang.Math.random()*99); //random number
          Link7 newLink = new Link7(n);         //make link
          linkArray[j] = newLink; //put in array
      }

      //display unsorted array
      System.out.print("Unsorted Array: ");
      for(int k=0; k <size; k++){
          System.out.print(linkArray[k].dData + " ");
      }
      System.out.println("");

      //Sorted list
        SortedList2 theSortedList = new SortedList2(linkArray);

        //links from list to array
        for(int l=0; l <size; l++){
            linkArray[l] = theSortedList.remove();
        }
        //Display sorted array
        System.out.print("Sorted Array: ");
        for(int k=0; k <size; k++){
            System.out.print(linkArray[k].dData + " ");
        }
        System.out.println("");





    }
}
