package chapter5;

/**
 * Created by SeleniumGuru.com on 4/10/18.
 */

class Link3 {
    public long dData; //data item(key)
    public Link3 next; //next link in list

    public Link3(long d){
        dData = d;
    }

    public void displayLink() { //display ourself
        System.out.print(dData + " ");
    }
}

class LinkList3 {
    private Link3 first;
    private Link3 last;

    public LinkList3()  {  //constructor
        first = null;
        last = null;
    }
    

    public boolean isEmpty() {      //true if list is empty;
        return (first == null);
    }

    public void insertFirst(long dd){
       Link3 newLink = new Link3(dd);
        
       if (isEmpty()) {
           last = newLink; //newLink <-- last
       }
        newLink.next = first;   //newLink ..> old first
        first = newLink;      // first ...> newLink
    }


    public void insertLast(long dd){
        Link3 newLink = new Link3(dd);

        if (isEmpty()) {
            last = newLink; //newLink <-- last
        } else {
            last.next = newLink;
        }
        last = newLink;      // newLink <.. last
    }

    public Link3 find(int key) {
       Link3 current = first; //start at first
        while(current.dData != key){    //while no match
            if (current.next == null){
                return null;
            } else {
                current = current.next;
            }
        }
        return current;         //found it
    }


    public Link3 delete(int key) {  //delete link with given key
       Link3 current = first; //start at first
       Link3 previous = first; //

        while(current.dData != key){    //while no match
            if (current.next == null){
                return null;
            } else {
                previous = current; //go to next link
                current = current.next;
            }
        }
        if (current == first) {     //if first link
            first = first.next; //change first
        } else {
            previous.next = current.next; //bypass it
        }

        return current;         //found it
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
       Link3 current = first;       //start at beginning of list
        while(current != null) {    //until end of list
           current.displayLink(); //print data
           current = current.next; //move to next link
        }
        System.out.println("");
    }
 }


public class FirstLastApp {
    public static void main(String[] args) {
        LinkList3 theList = new LinkList3(); //make new list
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);


        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);

        //Display list
        theList.displayList();

        theList.deleteFirst(); //delete first two items
        theList.deleteFirst();
        theList.displayList();

    }
}
