package chapter5;

/**
 * Created by SeleniumGuru.com on 4/10/18.
 */

class Link5 {
    public long dData; //data item(key)
    public Link5 next; //next link in list

    public Link5(long d){
        dData = d;
    }

    public void displayLink() { //display ourself
        System.out.print(dData + " ");
    }
}

class FirstLastList {
    private Link5 first;
    private Link5 last;

    public FirstLastList()  {  //constructor
        first = null;
        last = null;
    }
    

    public boolean isEmpty() {      //true if list is empty;
        return (first == null);
    }

    public void insertLast(long dd){
       Link5 newLink = new Link5(dd);
        
       if (isEmpty()) {
           first = newLink; // first ...> newLink
       } else {
           last.next = newLink; //old last ..> newLink
       }
        last = newLink;     // last ...> newLink
    }


    public long deleteFirst() //delete first link
    {
        long temp = first.dData;
        if (first.next == null){ //if only one item
            last = null;
        }
        first = first.next; //first ..> old next
        return temp;
    }


    public void displayList() {
        System.out.print("List (first..>last): ");
        Link5 current = first;       //start at beginning of list
        while(current != null) {    //until end of list
           current.displayLink(); //print data
           current = current.next; //move to next link
        }
        System.out.println("");
    }
 }

 class LinkQueue {
    private FirstLastList theList;
    public LinkQueue() {
        theList = new FirstLastList();
    }

    public void insert(long j) {
        theList.insertLast(j);
    }

    public long remove(){
        return theList.deleteFirst();
    }

    public boolean isEmpty() {
        return (theList.isEmpty());
    }

    public void displayQueue() {
        System.out.print("Queue (front..>rear)");
        theList.displayList();
    }

 }


public class LinkQueueApp {
    public static void main(String[] args) {
        LinkQueue theQueue = new LinkQueue(); //make new list
        theQueue.insert(20);
        theQueue.insert(40);

        theQueue.displayQueue();

        theQueue.insert(60);
        theQueue.insert(80);

        theQueue.displayQueue();

        theQueue.remove();
        theQueue.remove();

        theQueue.displayQueue();


    }
}
