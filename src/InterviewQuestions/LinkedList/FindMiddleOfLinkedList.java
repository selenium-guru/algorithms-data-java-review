package InterviewQuestions.LinkedList;


/**
 * Created by Ashok Tulachan on 5/10/18.
 * /**
 * Java program to find middle element of linked list in one pass.
 * In order to find middle element of linked list we need to find length first
 * but since we can only traverse linked list one time, we will use two pointers
 * one which we will increment on each iteration while other which will be
 * incremented every second iteration. so when first pointer will point to the
 * end of linked list, second will be pointing to the middle element of linked list
 * @author
 */



class LinkedList2 {
    private Node head;
    private Node tail;

    public LinkedList2(){
        this.head = new Node("head");
        tail = head;
    }

    public Node head(){
        return head;
    }

    public void add(Node node){
        tail.next = node;
        tail = node;
    }

    public static class Node{
        public Node next;
        private String data;

        public Node(String data){
            this.data = data;
        }
        public void setData(String data){
            this.data = data;
        }

        public Node next() {
            return next;
        }
        public void setNext(Node next){
            this.next = next;
        }
    }
}

public class FindMiddleOfLinkedList {
    public static void main(String[] args) {
        LinkedList2 linkedList = new LinkedList2();
        LinkedList2.Node head = linkedList.head();
        linkedList.add(new LinkedList2.Node("1"));
        linkedList.add(new LinkedList2.Node("2"));
        linkedList.add(new LinkedList2.Node("3"));
        linkedList.add(new LinkedList2.Node("4"));

        //finding middle element of linked list
        LinkedList2.Node current = head;
        int length = 0;
        LinkedList2.Node middle = head;

        while (current.next() != null) {
            length++;
            if (length % 2 == 0) {
                middle = middle.next;
            }
            current = current.next();

        }

        if (length % 2 == 1) {
            middle = middle.next;
        }

        System.out.println("length of LinkedList: " + length);
        System.out.println("middle element of LinkedList : " + middle);
    }


}
