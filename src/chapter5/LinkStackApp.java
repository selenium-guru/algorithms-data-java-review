package chapter5;

/**
 * Created by SeleniumGuru.com on 4/10/18.
 */

class Link4 {
    public long dData; //data item(key)
    public Link4 next; //next link in list

    public Link4(long d){
        dData = d;
    }

    public void displayLink() { //display ourself
        System.out.print(dData + " ");
    }
}

class LinkList4 {
    private Link4 first;
    private Link4 last;

    public LinkList4()  {  //constructor
        first = null;
        last = null;
    }
    

    public boolean isEmpty() {      //true if list is empty;
        return (first == null);
    }

    public void insertFirst(long dd){
       Link4 newLink = new Link4(dd);
        
       if (isEmpty()) {
           last = newLink; //newLink <-- last
       }
        newLink.next = first;   //newLink ..> old first
        first = newLink;      // first ...> newLink
    }


    public long deleteFirst() //delete first link
    {
        Link4 temp = first;
        if (first.next == null){ //if only one item
            last = null;
        }
        first = first.next; //first ..> old next
        return temp.dData;
    }




    public void displayList() {
        System.out.print("List (first..>last): ");
       Link4 current = first;       //start at beginning of list
        while(current != null) {    //until end of list
           current.displayLink(); //print data
           current = current.next; //move to next link
        }
        System.out.println("");
    }
 }

class LinkStack {
   private LinkList4 theList;
   public LinkStack() {
       theList = new LinkList4();
   }

   public void push(long j) {
       theList.insertFirst(j);
   }

   public long pop(){
       return theList.deleteFirst();
   }

   public boolean isEmpty() {
       return (theList.isEmpty());
   }

   public void displayStack() {
       System.out.print("Stack (top..>bottom)");
       theList.displayList();
   }

}


public class LinkStackApp {
    public static void main(String[] args) {
        LinkStack theStack = new LinkStack(); //make new list
        theStack.push(20);
        theStack.push(40);

        theStack.displayStack();

        theStack.push(60);
        theStack.push(80);

        theStack.displayStack();

        theStack.pop(); //pop items
        theStack.pop();

        theStack.displayStack();


    }
}
