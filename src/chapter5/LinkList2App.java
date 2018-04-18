package chapter5;

/**
 * Created by SeleniumGuru.com on 4/10/18.
 */

class Link2 {
    public int iData; //data item(key)
    public double dDate; //date item
    public Link2 next; //next link in list

    public Link2(int id, double dd){
        iData = id;
        dDate = dd;
    }

    public void displayLink() { //display ourself
        System.out.print("(" + iData + ", " + dDate + ")");
    }
}

class LinkList2 {
    private Link2 first;

    public LinkList2()  {  //constructor
        first = null;
    }

    public boolean isEmpty() {      //true if list is empty;
        return (first == null);
    }

    public void insertFirst(int id, double dd){
        Link2 newLink = new Link2(id, dd);
        newLink.next = first; //newLink ...> old first
        first = newLink;      // first ...> newLink
    }


    public Link2 find(int key) {
        Link2 current = first; //start at first
        while(current.iData != key){    //while no match
            if (current.next == null){
                return null;
            } else {
                current = current.next;
            }
        }
        return current;         //found it
    }


    public Link2 delete(int key) {  //delete link with given key
        Link2 current = first; //start at first
        Link2 previous = first; //

        while(current.iData != key){    //while no match
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

    public void displayList() {
        System.out.print("List (first..>last): ");
        Link2 current = first;       //start at beginning of list
        while(current != null) {    //until end of list
           current.displayLink(); //print data
           current = current.next; //move to next link
        }
        System.out.println("");
    }
 }


public class LinkList2App {
    public static void main(String[] args) {
        LinkList2 theList = new LinkList2(); //make new list
        theList.insertFirst(22, 2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 6.99);

        //Display list
        theList.displayList();

        Link2 f = theList.find(44); //find item
        if (f != null) {
            System.out.println("Found link  with key " +f.iData);
        } else {
            System.out.println("Can't find link.");
        }

        Link2 d = theList.delete(66);
        if (d!= null){
            System.out.println("Deleted link with key " + d.iData);
        } else {
            System.out.println("Can't delete link");
        }
        theList.displayList();

    }
}
