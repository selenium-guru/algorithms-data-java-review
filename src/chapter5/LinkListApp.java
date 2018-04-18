package chapter5;

/**
 * Created by SeleniumGuru.com on 4/10/18.
 */

class Link {
    public int iData; //data item(key)
    public double dDate; //date item
    public Link next; //next link in list

    public Link(int id, double dd){
        iData = id;
        dDate = dd;
    }

    public void displayLink() { //display ourself
        System.out.print("(" + iData + ", " + dDate + ")");
    }
}

class LinkList {
    private Link first;

    public LinkList()  {  //constructor
        first = null;
    }

    public boolean isEmpty() {      //true if list is empty;
        return (first == null);
    }

    public void insertFirst(int id, double dd){
        Link newLink = new Link(id, dd);
        newLink.next = first; //newLink ...> old first
        first = newLink;      // first ...> newLink
    }

    public Link deleteFirst() {
        Link temp = first;      //save reference to link
        first = first.next; //delete it: first-->old next
        return temp;
    }


    public void displayList() {
        System.out.print("List (first..>last): ");
        Link current = first;       //start at beginning of list
        while(current != null) {    //until end of list
           current.displayLink(); //print data
           current = current.next; //move to next link
        }
        System.out.println("");
    }
 }


public class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList(); //make new list
        theList.insertFirst(22, 2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 6.99);

        //Display list
        theList.displayList();

        while(!theList.isEmpty()){
            Link aLink = theList.deleteFirst(); //delete link
            System.out.print("Deleted");
            aLink.displayLink();
            System.out.println("");
        }
        theList.displayList();
    }
}
