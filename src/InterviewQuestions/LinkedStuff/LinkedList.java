package InterviewQuestions.LinkedStuff;

/**
 * Created by Ashok Tulachan on 5/10/18.


//Pseudo code
 - Create a node
 - Create a method to actually delete the node
 - Create a  method to actually push elements in the node
 - Create an object
 - Delete the node from the object
 - Print the list



 */



public class LinkedList {
    Node head;
    private int size = 0;

    class Node {
        int data;
        Node next;

        Node(int v) {
            this.data = v;
            next = null;
        }
    }



    void printList(){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

        void push(int val){
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
        }

        void deleteNode(int key){
            Node curr = head, prev = null;
            if (curr != null && curr.data == key){
                head = curr.next;
                return;
            }

            while (curr != null && curr.data != key){
                prev = curr;
                curr = curr.next;
            }

            if (curr == null) return;

            prev.next = curr.next;

        }

        boolean findKey(int key){
            Node curr = head;
            boolean found = false;

            while (curr != null && curr.data != key){
                curr = curr.next;
            }

            if (curr != null && curr.data == key){
                found = true;
            }

            if (curr == null) found = false;
            return found;
        }

        //Pseudo code
        // 1- Initialize head  node as curr node
        // 2- Initialize next, prev as null
        // 3- While looop
                // - Make next as curr.node
                // - Make currnode.next = prev
                // - Make prev as currNode
                // - Make curr as nextNode
       // 4- initialize head as prev;
       // print out the list

      void printReverse(){
        Node curr = head, prev = null, next = null;

        while (curr != null){
            next = curr.next; //Next = forward
            curr.next = prev; //Now make prev as curr.next
            prev = curr; //Now make prev as current node
            curr = next; // Then make curr as next node;
        }

        head = prev;
        printList();
      }

      int size(){
        return size;
      }

    void addItemAtFirst(int v){
        //First create a node
        Node newNode = new Node(v);
        //Equate the next element to be head
        newNode.next = head;
        //Now make head node as new Node
        head = newNode;

    }

    void addItemAtEnd(int v){
       //first create a node
        Node newNode = new Node(v);

        //Initialize variables
        Node curr = head;

        //Add the new node if there is noe lement
        if (curr == null)
            newNode = head;

        //While loop until the last element
        while (curr.next != null){
            curr = curr.next; //go to the next element
        }

        curr.next = newNode; //at the end add that node at last.
    }

    void removeDuplicates(int v){
        Node curr = head;
        //if there is nothing, return the list
        if (curr == null)
            curr = new Node(v);
        while (curr.next != null){
            if (v == curr.next.data){
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

    }

    void reverseArray(){
        Node curr = head, prev= null, next = null;
        while (curr.next != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
        printList();


    }




    public static void main(String[] args){
        LinkedList llist = new LinkedList();
        llist.push(1);
        llist.push(5);
        llist.push(7);
        llist.push(8);
        llist.printList();
        llist.deleteNode(8);
        System.out.println();
        llist.printList();
        System.out.println();
//        System.out.println(llist.findKey(9));
        llist.printReverse();
        System.out.println();
        llist.addItemAtFirst(2);
        System.out.println("Finally");
        llist.printList();
        llist.addItemAtEnd(9);
        System.out.println("Finally");
        llist.printList();
        llist.removeDuplicates(7);
        System.out.println("Finally");
        llist.printList();

    }
}














   //
//   void deleteNode(int key) {
//        Node temp = head, prev = null;
//
//        if (temp != null && temp.value == key) {
//            head = temp.next;
//            return;
//
//        }
//
//       while (temp != null && temp.value != key) {
//           prev = temp;
//           temp = temp.next;
//       }
//
//       if (temp == null) return;
//
//        prev.next= temp.next;
//
//
//   }
//
//
//   void push(int newValue) {
//        Node newNode = new Node(newValue);
//        newNode.next = head;
//        head = newNode;
//
//   }
//
//   void printList() {
//        Node nList = head;
//        while (nList != null) {
//            System.out.println(nList.value);
//            nList = nList.next;
//        }
//   }
//
//    public static void main(String[] args) {
//        LinkedList llist = new LinkedList();
//        llist.push(1);
//        llist.push(7);
//        llist.push(8);
//        llist.push(11);
//        llist.printList();
//        llist.deleteNode(8);
//        System.out.println();
//        llist.printList();
//    }
//}
