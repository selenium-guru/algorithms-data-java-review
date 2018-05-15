package InterviewQuestions.LinkedStuff;

/**
 * Created by Ashok Tulachan on 5/9/18.
 */
class Node {
   private int value;
   private Node next;
   public Node(int v, Node n){
       value = v;
       next = n;
   }
//   public Node(int v){
//       value = v;
//       next = null;
//   }
    private Node head;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    //Insert element at the head
    public void addHead(int value){
        head = new Node(value, head);
        size++;
    }


    //Insert element at the tail
    public void addTail(int value){
        Node newNode = new Node(value, null);
        Node curr = head;
        if (head == null){
            head = newNode;
        }

        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    //Traversing linked list
    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public void sortedInsert() {
        Node newNode = new Node(value, null);
        Node curr = head;

        if (curr== null || curr.value > value){
            newNode.next = head;
            head = newNode;
            return;
        }

        while(curr.next != null && curr.next.value < value){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }

    //Search Element
    public boolean isPresent(int data){
        Node temp = head;
        while (temp != null){
            if(temp.value == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //Delete first element
    public int removeHead() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("EmptyListException");
        }
        int value = head.value;
        head = head.next;
        size--;
        return value;
    }

    //Delete node
    public boolean deleteNode(int delValue){
        Node temp = head;
        if(isEmpty())
            return false;
        if(delValue == head.value){
            head=head.next;
            size--;
            return true;
        }
        while (temp.next != null){
            if(temp.next.value == delValue){
                temp.next = temp.next.next;
                size--;
                return true;
            }
            temp = temp.next;
        }
        return false;

    }

    //Delete all occurences of the particular value in linked list
    public void deleteNodes(int delValue){
        Node currNode = head;
        Node nextNode;

        while(currNode != null && currNode.value == delValue){
            head = currNode.next;
            currNode = head;
        }

        while(currNode != null){
            nextNode = currNode.next;
            if(nextNode != null && nextNode.value == delValue){
                currNode.next = nextNode.next;
            } {
                currNode = nextNode;
            }
        }
    }


    //Delete all elements
    public void freeList(){
        head = null;
        size=0;
    }

    //Reverse a linkedList
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next = null;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        head = prev;
    }


    //Remove duplicates form the linked list
    public void removeDuplicate() {
        Node curr = head;
        while(curr != null){
            if(curr.next != null && curr.value == curr.next.value){
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
    }


}


