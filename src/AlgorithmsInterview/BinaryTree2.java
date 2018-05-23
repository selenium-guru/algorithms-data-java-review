package AlgorithmsInterview;

/**
 * Created by Ashok Tulachan on 5/19/18.
 *
 *
 * Binary Trees
 *
 *        1
 *      /   \
 *      2     3
 *      /\    / \
 *      4 5  6   7
 *
 *
 *      Pseudo code
 *      Create Node class
 *        int v, Node left, Node right;
 *        create constructor where left, right are null
 *
 *
 *        Binary trees
 *         Initialize node as root
 *
 *         //print nodes
 *         printNodes()
 *          - intialize Node node as root
 *           - while root is not null, recursively call printNodes
 *           - print out the node value
 *           - recursevely call printNodes on right.
 */

class Node {
    int v;
    Node left, right;

    Node(int v){
        this.v = v;
        left = null;
        right = null;
    }
}
public class BinaryTree2 {
    Node root;

    //print node value
    //pseudo code
    //printNodes(Node node)
    // if (node != null)
       //recursively call printNodes for left node
       //print out the node value
       // recursively call printNodes for right node

    void printNodes(Node node){
        //if node is not null, recursively call the method for left and right
        if (node != null){
            printNodes(node.left);
            System.out.println(" "+ node.v);
            printNodes(node.right);
        }
    }




    //Find the LCA of binary tree for two numbers
    //LCA(4,5) -> 2, LCA(6,7) -> 1
    Node findLCA(Node node, int first, int second){
        //return Integer.MAX if node is null
        if (node == null) return null;
        //return node if node value is equal to start and end
        if (node.v == first || node.v == second){
            return node;
        }
        //find the LCA on left and right
        Node left = findLCA(node.left, first, second);
        Node right = findLCA(node.right, first, second);

        //return node if left and right is not null
        if (left != null && right != null){
            return node;
        }

        if (left != null){
            return left;
        } else {
            return right;
        }
    }

    //find max
    int findMax(Node curr){
        //return integer.min value if curr node is null
        if (curr == null) return Integer.MIN_VALUE;
        //Initialize the value
        int minValue = curr.v;
        int left = findMax(curr.left);
        int right = findMax(curr.right);
        if (left > minValue){
            minValue = left;
        }
        if (right > minValue){
            minValue = right;
        }
        return minValue;
    }

    //find min
    int findMin(Node curr){
        //return integer.max if curr node is null
        if (curr == null) return Integer.MAX_VALUE;
        //initialize the min as curr node value
        int min = curr.v;
        int left = findMin(curr.left);
        int right = findMin(curr.right);
        if (left < min){
            min = left;
        }
        if (right < min){
            min = right;
        }
        return min;
    }


    //find Node
      // boolean findNode(curr, v)
          //return null
         //if curr.value = value, return curr
         // left node = findNode(curr.left, v)
         // right node = findNode(curr.right, v);
         // return left if true
        // return right if true

    boolean findNode(Node node, int v){
        boolean left, right;
        if (node == null) return false;
        if (node.v == v) {
            return true;
        }
        left = findNode(node.left, v);
        right = findNode(node.right, v);
        if (left){
            return true;
        }
        if (right){
            return true;
        }
        return false;
    }

    //find epth
    int findDepth(Node curr){
        //return 0 if curr is null else find left and right recursively
        // increment if left > right else return right
        if (curr == null){
            return 0;
        } else {
            int left = findDepth(curr.left);
            int right = findDepth(curr.right);
            if (left > right){
                return left+1;
            } else {
                return right+1;
            }
        }
    }


    //insert node
//    Node insertNode(Node curr, int v){
//        if (curr == null){
//            curr = new Node(v);
//        } else {
//            if (curr.v > v){
//                curr.left = insertNode(curr.left, v);
//            } else {
//                curr.right = insertNode(curr.right, v);
//            }
//        }
//        return curr;
//    }

    //createBST
    Node createBST(int[] arr, int start, int end){
        Node curr = null;
        int mid = (start + end)/2;
        curr = new Node(mid);
        curr.left = createBST(arr, start, mid-1);
        curr.right = createBST(arr, mid+1, end);
        return curr;
    }

    int sumALLBST(Node curr){
        Object[] studentName = new Object[20];
        int leftSum, rightSum, sum;
        if (curr == null) return Integer.MIN_VALUE;
        leftSum= sumALLBST(curr.left);
        rightSum = sumALLBST(curr.right);
        sum = leftSum + rightSum + curr.v;
        return sum;
    }

    Node insertNode(Node curr, int v){
        if (curr == null){
            curr = new Node(v);
        } else {
            if (curr.v > v){
                curr.left = insertNode(curr.left, v);
            } else {
                curr.right = insertNode(curr.right, v);
            }
        }

        return curr;
    }


    public static void main(String[] args) {
        BinaryTree2 tree = new BinaryTree2();
        tree.root = new Node(1);
        tree.root.left = new Node( 2);
        tree.root.right = new Node( 3);
        tree.root.left.left = new Node( 4);
        tree.root.left.right = new Node( 5);
        tree.root.right.left = new Node( 6);
        tree.root.right.right = new Node( 7);

        tree.printNodes(tree.root);
        System.out.println(tree.findLCA(tree.root, 4, 5).v);
        System.out.println(tree.findLCA(tree.root, 6, 7).v);
        System.out.println(tree.findMax(tree.root));
        System.out.println(tree.findMin(tree.root));
        System.out.println(tree.findNode(tree.root, 4));
        System.out.println(tree.findDepth(tree.root));
        tree.insertNode(tree.root, 8);
        tree.printNodes(tree.root);
        int[] arr1 = {1, 2, 3, 4, 5};
        tree.createBST(arr1, 0, arr1.length-1);
        System.out.println(tree.sumALLBST(tree.root));
    }
}
