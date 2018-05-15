package InterviewQuestions.TreeStuff;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Created by Ashok Tulachan on 5/14/18.
 */

class Node {
    int value;
    Node lChild;
    Node rChild;

    Node(int v){
        lChild = null;
        rChild = null;
        value = v;
    }

}
public class BinaryTree {
    Node root;

    //print out the nodes
    void printNodes(Node node){
        if (node != null){
            printNodes(node.lChild);
            System.out.println(node.value);
            printNodes(node.rChild);
        }
    }

    //Find lowest common ancestor
    Node findLCA(Node curr, int first, int second){
       if (curr == null) return null;

       //Find if the node value matches with first and second, if it matches return the node
        if (curr.value == first || curr.value == second){
            return curr;
        }

        //Now find the left and right lca
        Node left = findLCA(curr.lChild, first, second);
        Node right = findLCA(curr.rChild, first, second);

        //Now return node if left and right is not null
        if (left != null && right != null){
            return curr;
        }

        if (left != null){
            return left;
        } else {
            return right;
        }

    }

    //Find the node value by key
    boolean findNode(Node node, int key){
        boolean left, right;
        //Return false if node is null
        if (node == null) return false;
        //Return true if node value is equal to key
        if (node.value == key) return true;
        //find the left node value
        left = findNode(node.lChild, key);
        if (left) return true;
        right = findNode(node.rChild, key);
        if (right) return true;
        //return true if true
        //find the right node value
        //return true if true
        return false;
    }


    //Find max
    int findMax(Node node){
       if (node == null) return Integer.MIN_VALUE;

       //Initialize the current node value
        int value = node.value;
        int left = findMax(node.lChild);
        int right = findMax(node.rChild);
        if (left > value){
            value = left;
        }

        if (right > value){
            value = right;
        }
        return value;
    }

    int findMin(Node node){
        if (node == null) return Integer.MAX_VALUE;

        //initialize the node value
        int value = node.value;

        //now find the left and right value
        int left = findMin(node.lChild);
        int right = findMin(node.rChild);
        if (left < value){
            value = left;
        }

        if (right < value){
            value = right;
        }

        return value;
    }


   //Insert node
    Node insertNode(Node curr, int v){
        //Return the new node if there are no nodes

        //else
          //if the curr node value is greater than v
          //insert as left child node
          // else
             // insert as right child node

        if (curr == null){
            curr = new Node(v);
        } else {
            if (curr.value > v){
                curr.lChild = insertNode(curr.lChild, v);
            } else {
                curr.rChild = insertNode(curr.rChild, v);
            }
        }
        return curr;

    }


    //Find sum of all BLT
    int sumAllBLT(Node node){
        int sum, rightSum, leftSum;
        if (node == null) return 0;

        leftSum = sumAllBLT(node.lChild);
        rightSum = sumAllBLT(node.rChild);
        sum = leftSum + rightSum + node.value;
        return sum;

    }

    void createBinarySearchTree(int[] arr){
        root = createBinarySearchTree(arr, 0, arr.length-1);
    }


    Node createBinarySearchTree(int[] arr, int start, int end){
        Node node = null;
        if (start > end) return null;
        int mid = (start + end)/2;
        node = new Node(arr[mid]);
        node.lChild = createBinarySearchTree(arr, 0, mid-1);
        node.rChild = createBinarySearchTree(arr, mid+1, end);
        return node;
    }


    void printPostOrder(Node node){
        if (node != null){
            printPostOrder(node.lChild);
            printPostOrder(node.rChild);
            System.out.print("" + node.value);
        }
    }


    private void printTreeInOrder(Node cur){
        if(cur != null)
        {
            printTreeInOrder(cur.lChild);
            System.out.print(cur.value + ' ');
            printTreeInOrder(cur.rChild);
        }
    }

    private int findDepth(Node curr){
        int lDepth, rDepth = 0;
        if (curr == null) {
            return 0;
        } else {
            lDepth = findDepth(curr.lChild);
            rDepth = findDepth(curr.rChild);
            if (lDepth > rDepth){
                return lDepth + 1;
            } else {
                return rDepth + 1;
            }
        }

    }

    private void findNthOrder(Node node, int index, int counter){
        //first
        if (node != null){
            findNthOrder(node.lChild, index, counter);
            counter++;
            if (counter == index){
                System.out.println(" " + node.value);
                findNthOrder(node.rChild, index, counter);
            }
        }
    }

    private void findPreNthOrder(Node node, int index, int counter){
        //first
        if (node != null){
            counter++;
            if (counter == index){
                System.out.println(" " + node.value);
//                findNthOrder(node.rChild, index, counter);
            }
            findPreNthOrder(node.rChild, index, counter);
            findPreNthOrder(node.lChild, index, counter);
//            if (counter == index){
//                System.out.println(" " + node.value);
//                findNthOrder(node.rChild, index, counter);
//            }
        }
    }

    private void findInOrder(Node node, int index, int counter){
        if (node != null){
            findInOrder(node.lChild, index, counter);
            counter++;
            if (counter == index){
                System.out.println(" " + node.value);

            }
            findInOrder(node.rChild, index, counter);

        }
    }

    private void findPostNthOrder(Node node, int index, int counter){
        //first
        if (node != null){
            findPostNthOrder(node.lChild, index, counter);
            findPostNthOrder(node.rChild, index, counter);
            counter++;
            if (counter == index){
                System.out.println(" "+ node.value);
            }
        }
    }

    private boolean isIdentical(Node node1, Node node2){
        if (node1 == null && node2 == null){
            return true;
        } else if (node1 == null || node2 == null) {
            return false;
        } else {
            return (isIdentical(node1.lChild, node2.lChild) && (isIdentical(node1.rChild, node2.rChild)) && (node1.value == node2.value));
        }
    }

    void printAllPath(Node node, ArrayDeque<Integer> stk){
        if (node == null) return;
        stk.push(node.value);
        if (node.lChild == null && node.rChild == null){
            System.out.println(stk);
            stk.pop();
            return;
        }

        printAllPath(node.lChild,stk);
        printAllPath(node.rChild, stk);
        stk.pop();
    }

    int findMaxInBinaryTree(Node curr){
        int left, right;
        if (curr == null) return Integer.MIN_VALUE;
        int max = curr.value;
        left = findMaxInBinaryTree(curr.lChild);
        right = findMaxInBinaryTree(curr.rChild);
        if (left > max){
            max = left;
        }
        if (right > max){
            max = right;
        }
        return max;
    }

    boolean searchValueInBST(Node curr, int v){
        boolean left, right;
        if (curr == null) return false;
        if (curr.value == v) return true;
        left = searchValueInBST(curr.lChild, v);
        if (left) return true;
        right = searchValueInBST(curr.rChild, v);
        if (right) return true;
        return false;
    }

    int findMaximumDepthInBST(Node curr){
        int left, right = 0;
        if (curr == null) {
            return 0;
        } else {
            left = findMaximumDepthInBST(curr.lChild);
            right = findMaximumDepthInBST(curr.rChild);
            if (left > right){
                return left + 1;
            } else {
                return right + 1;
            }
        }
    }

    int countNumOfFullNodes(Node curr){
        int count;
        if (curr == null)
            return 0;
        count = countNumOfFullNodes(curr.lChild) + countNumOfFullNodes(curr.rChild);
        if (curr.lChild != null && curr.rChild != null){
            count++;
        }
        return count;
    }

    Node insertNodeInBST(Node curr, int v){
        if (curr == null){
            curr = new Node(v);
        } else {
            if (curr.value > v){
                curr.lChild = new Node(v);
            } else {
                curr.rChild = new Node(v);
            }
        }
        return curr;
    }

    boolean findNodeInBST(Node curr, int v){
        if (curr == null) return false;
        while (curr !=  null){
            if (curr.value == v){
                return true;
            } else if (curr.value > v){
                curr = curr.lChild;
            } else {
                curr = curr.rChild;
            }

        }

        return false;

    }

    int findMaxInBST(Node curr){
       if (curr == null) return Integer.MIN_VALUE;
       while (curr.rChild != null){
           curr = curr.rChild;
       }
       return curr.value;
    }


    int findMinInBST(Node curr){
        if (curr == null) return Integer.MAX_VALUE;
        while (curr.lChild != null){
            curr = curr.lChild;
        }
        return curr.value;
    }

    boolean isBST(Node curr, int minBST, int maxBST){
        if (curr == null) return true;
        int min = findMinInBST(curr);
        int max = findMinInBST(curr);
        if (curr.value < findMinInBST(curr) || curr.value > findMaxInBST(curr))
            return false;
        return isBST(curr.lChild, min, curr.value) && isBST(curr.rChild, curr.value, max);
    }

    //Find lowest common ancestor
    int findLCAInBST(Node curr, int first, int second){
        if (curr == null) return Integer.MAX_VALUE;
        Node left = null, right = null;

        //Find if the node value matches with first and second, if it matches return the node
        if (curr.value == first || curr.value == second){
            return curr.value;
        }

//        left = findLCA(curr.lChild, first, second);
//        right = findLCA(curr.rChild, first, second);

//        //Now find the left and right lca
        if (curr.value > first && curr.value > second) {
            findLCA(curr.lChild, first, second);
        }

        if (curr.value < first && curr.value < second) {
            findLCA(curr.rChild, first, second);
        }
//
        return curr.value;

    }



    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.lChild = new Node(2);
        tree.root.rChild = new Node(3);
        tree.root.lChild.lChild = new Node(4);
        tree.root.lChild.rChild = new Node(5);
        tree.root.rChild.lChild = new Node(6);
        tree.root.rChild.rChild = new Node(7);
//        tree.printNodes(tree.root);
//        System.out.println(tree.findLCA(tree.root, 4, 5).value);
//        System.out.println(tree.findNode(tree.root, 9));
//        System.out.println(tree.findMax(tree.root));
//        System.out.println(tree.findMin(tree.root));
//        tree.insertNode(tree.root, 12);
//        tree.printNodes(tree.root);
//        System.out.println(tree.sumAllBLT(tree.root));
//        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
//        BinaryTree tree2 = new BinaryTree();
//        tree2.createBinarySearchTree(arr1);
        //tree2.printNodes(tree2.root);
        System.out.println(tree.findDepth(tree.root));
        tree.findNthOrder(tree.root, 2, 0);
        tree.findInOrder(tree.root, 2, 0);
//        tree.findPreNthOrder(tree.root, 1, 0);
//        tree.findPostNthOrder(tree.root, 1, 0);


        BinaryTree tree2 = new BinaryTree();
        tree2.root = new Node(1);
        tree2.root.lChild = new Node(2);
        tree2.root.rChild = new Node(3);
        tree2.root.lChild.lChild = new Node(4);
        tree2.root.lChild.rChild = new Node(5);
        tree2.root.rChild.lChild = new Node(6);
        tree2.root.rChild.rChild = new Node(7);
        System.out.println(tree2.isIdentical(tree.root, tree2.root));
        ArrayDeque<Integer> list2 = new ArrayDeque<>();
        tree2.printAllPath(tree2.root, list2);
        System.out.println(tree2.searchValueInBST(tree2.root, 6));
        System.out.println(tree2.findMaximumDepthInBST(tree2.root));
        System.out.println(tree2.findMaxInBST(tree2.root));
        System.out.println(tree2.findMinInBST(tree2.root));
        System.out.println(tree2.isBST(tree2.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        System.out.println(tree2.findLCA(tree2.root, 4, 5).value);
        System.out.println(tree2.findLCAInBST(tree2.root, 4, 5));


    }
}
