package chapter5;

/**
 * Created by SeleniumGuru.com on 4/10/18.
 */

class Link6 {
    public long dData; //data item(key)
    public Link6 next; //next link in list

    public Link6(long d){
        dData = d;
    }

    public void displayLink() { //display ourself
        System.out.print(dData + " ");
    }
}

class SortedList {
    private Link6 first;

    public SortedList()  {  //constructor
        first = null;
    }

    public boolean isEmpty() {      //true if list is empty;
        return (first == null);
    }

    public void insert(long key){
       Link6 newLink = new Link6(key);
       Link6 previous = null;
       Link6 current= first;

       while (current != null && key > current.dData) {
           previous = current;
           current = current.next; //go to next item
       }
       if (previous == null) {
           first = newLink;     //first ..> newlinkk
       } else {
           previous.next = newLink; //old prev --> newlink
       }
       newLink.next = current; //newLink ..> old current
    }

    public Link6 remove() {
        Link6 temp = first; //save first
        first = first.next; //delete first
        return temp; //return value;
    }




    public void displayList() {
        System.out.print("List (first..>last): ");
        Link6 current = first;       //start at beginning of list
        while(current != null) {    //until end of list
           current.displayLink(); //print data
           current = current.next; //move to next link
        }
        System.out.println("");
    }
 }


public class SortedListApp {
    public static void main(String[] args) {
        SortedList theSortedList = new SortedList(); //make new list
        theSortedList.insert(20);
        theSortedList.insert(40);

        theSortedList.displayList();

        theSortedList.insert(10);
        theSortedList.insert(30);
        theSortedList.insert(40);

        theSortedList.displayList();

        theSortedList.remove(); //pop items
        theSortedList.displayList();


    }
}
