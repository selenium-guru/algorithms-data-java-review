//package AlgorithmsInterview;
//
///**
// * Created by Ashok Tulachan on 5/17/18.
// * //find LCA, (5,2);
// *  4
// * / \
// * 2  5
// * /   \
// * 1   3
// */
//class Node {
//    int value;
//    Node left;
//    Node right;
//    Node(int v){
//        this.value = v;
//        left = null;
//        right = null;
//    }
//
//}
//public class BinaryTree {
//    Node root;
//
//    Node findLCA(Node node, int first, int second){
//        //return null if node is null
//        if (node == null) return null;
//        if (node.value == first || node.value == second){
//            return node;
//        }
//
//        //find the LCA on left and right
//        Node left = findLCA(node.left, first, second);
//        Node right = findLCA(node.right, first, second);
//
//        //return the node if left and right are not null
//        if (left != null && right != null) {
//            return node;
//        }
//
//        //return left if left is not null
//        if (left != null){
//            return left;
//        } else {
//            return right;
//        }
//
//    }
//
//    void printNodes(Node curr){
//        if (curr != null){
//            printNodes(curr.left);
//            System.out.print( " " + curr.value);
//            printNodes(curr.right);
//        }
//    }
//
//
//    //find node
//    boolean findNode(Node curr, int v){
//        boolean left, right;
//        if (curr == null) return false;
//        if (curr.value == v){
//            return true;
//        }
//        left = findNode(curr.left, v);
//        right = findNode(curr.right, v);
//
//        if (left)
//            return true;
//        if (right)
//            return true;
//        return false;
//
//    }
//
//    //insert node
//    Node insertNode(Node curr, int v){
//        if (curr == null) {
//            curr = new Node(v);
//        } else {
//            if (curr.value > v)
//            {
//                curr.left = insertNode(curr.left, v);
//            } else {
//                curr.right = insertNode(curr.right, v);
//            }
//        }
//        return curr;
//    }
//
//    //find max
//    int findMax(Node node){
//        if (node == null) return Integer.MIN_VALUE;
//        int max = node.value;
//        int left = findMax(node.left);
//        int right = findMax(node.right);
//
//        if (left > max){
//            max = left;
//        }
//
//        if (right > max){
//            max = right;
//        }
//        return max;
//    }
//
//    //find min
//    int findMin(Node node){
//        if (node == null) return Integer.MAX_VALUE;
//        int min = node.value;
//        int left = findMin(node.left);
//        int right = findMin(node.right);
//        if (left < min){
//            min = left;
//        }
//        if (right < min){
//            min = right;
//        }
//        return min;
//    }
//
//    int sumALLBST(Node node){
//        //return min if node == null
//        if (node == null) return Integer.MIN_VALUE;
//        //int value = node.value;
//        int leftSum, rightSum, sum;
//        leftSum = sumALLBST(node.left);
//        rightSum = sumALLBST(node.right);
//        sum = leftSum + rightSum + node.value;
//        return sum;
//    }
//
//
//    int findDepth(Node node){
//        int leftDepth, rightDepth = 0;
//        if (node == null){
//            return 0;
//        } else {
//            leftDepth = findDepth(node.left);
//            rightDepth = findDepth(node.right);
//            if (leftDepth > rightDepth){
//                return leftDepth + 1;
//            } else {
//                return rightDepth + 1;
//            }
//        }
//
//    }
//
//    Node createBinarySearchTree(int[] arr, int start, int end){
//        Node curr = null;
//        int mid = (start + end)/2;
//        curr =  new Node(arr[mid]);
//        curr.left = createBinarySearchTree(arr, start, mid-1);
//        curr.right = createBinarySearchTree(arr, mid+1, end);
//        return curr;
//    }
//
//
//
//    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//        tree.root.right.left = new Node(6);
//        tree.root.right.right = new Node(7);
//        System.out.println(tree.findLCA(tree.root, 4, 5).value);
//        tree.printNodes(tree.root);
//        System.out.println(tree.findMax(tree.root));
//        System.out.println(tree.findMin(tree.root));
//        System.out.println(tree.sumALLBST(tree.root));
//        tree.insertNode(tree.root, 8);
//        tree.printNodes(tree.root);
//        System.out.println(tree.findNode(tree.root, 6));
//        System.out.println(tree.findDepth(tree.root));
//    }
//}
