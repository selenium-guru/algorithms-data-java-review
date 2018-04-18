package chapter8;

/**
 * Created by SeleniumGuru.com on 4/15/18.
 */

class Node {
    int iData; //data used by key value
    double fData; //other data
    Node leftChild;
    Node rightChild;

    public void displayNode()
    {

    }
}


class Tree {
    private Node root;
    public Node find(int key){
        Node current = root; //start as root
        while(current.iData != key){
            if (key<current.iData){
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }

            if (current == null){
                return null;
            }

        }

        return current;

    }

    public void insert(int id, double dd){
        Node newNode = new Node(); //make new node
        newNode.iData = id;         //insert data
        newNode.fData = dd;
        if(root == null){
            root = newNode;
        } else {
            Node current = root; //start at root;
            Node parent;
            while(true){
                parent = current;
                if (id < current.iData) { //go left?
                    current = current.leftChild;
                    if (current == null){
                        parent.leftChild = newNode;
                        return;
                    }
                } else {                //go right
                    current = current.rightChild;
                    if (current == null) { // if end of line
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }

    }

    public void delete(int id){

    }
}


public class TreeApp {
    public static void main(String[] args){
        Tree theTree = new Tree();
        theTree.insert(50, 1.5);
        theTree.insert(25, 1.7);
        theTree.insert(75, 1.9);

        Node found = theTree.find(25);
        if (found != null){
            System.out.println("Found the key with 25");
        } else {
            System.out.println("Could not find the key with 25");
        }
    }
}
