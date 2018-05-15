//package InterviewQuestions.TreeStuff;
//
//import java.util.ArrayDeque;
//
///**
// * Created by Ashok Tulachan on 5/13/18.
// */
//
//class Node {
//    int value;
//    Node lChild;
//    Node rChild;
//
//    Node(int v){
//        lChild = null;
//        rChild = null;
//        value = v;
//    }
//}
//public class Tree {
//    Node root;
//    Node findLCA(int first, int second){
//        return findLCA(root, first, second);
//    }
//
//    Node findLCA(Node curr, int first, int second){
//        //if curr is null, return null;
//        if (curr == null) return null;
//
//        //if the curr node value matches with key in first and second
//        //then return the node
//        if (curr.value == first || curr.value == second){
//            return curr;
//        }
//
//        //if it doesn't match, find it in right and left
//        Node left = findLCA(curr.lChild, first, second);
//        Node right = findLCA(curr.rChild, first, second);
//
//        if (left != null && right != null)
//            return curr;
//
//        if (left != null)
//            return left;
//        else
//            return right;
//
//
//
//    }
//
//
//
//    int findMax(Node node){
//        if (node == null) return Integer.MIN_VALUE;
//
//        //initialize res as the node value
//        int res = node.value;
//
//        //Now recursively find the max of left node and right node value
//        int left = findMax(node.lChild);
//        int right = findMax(node.rChild);
//
//        if (left > res)
//            res = left;
//
//        if (right > res)
//            res = right;
//
//        return res;
//    }
//
//
//    int findMin(Node node){
//        if (node == null) return Integer.MAX_VALUE;
//
//        //initialize
//        int res = node.value;
//
//        int left = findMin(node.lChild);
//        int right = findMin(node.rChild);
//
//        if (left < res)
//            res = left;
//
//        if (right < res)
//            res = right;
//
//        return res;
//
//
//    }
//
//
//    boolean searchValue(Node node, int value){
//        boolean left;
//        boolean right;
//        //return false if node is null
//        if (node == null) return false;
//
//        //return true if node value matches with key
//        if (node.value == value) return true;
//
//        //find left and right value
//        left = searchValue(node.lChild, value);
//        if (left)
//            return true;
//        right = searchValue(node.rChild, value);
//        if (right)
//            return true;
//        return false;
//    }
//
//
//    //Sum of all bt
////    public int sumAllBT(){
////        return sumAllBT(root);
////    }
//
//    private int sumAllBT(Node node){
//
//        int leftSum, rightSum;
//        int sum = 0;
//        if (node == null) return 0;
//
//        //Find sum on left node and right node
//        leftSum = sumAllBT(node.lChild);
//        rightSum = sumAllBT(node.rChild);
//
//        sum = leftSum + rightSum + node.value;
//        return sum;
//
//
//
//    }
//
//    private Node createBinaryTree(int[] arr, int start, int end){
//        Node curr = null;
//        if (start > end)
//            return null;
//
//        //Now find the mid using binary search
//        int mid = (start + end)/2;
//
//        //create a current node with mid value
//        curr = new Node(arr[mid]);
//
//        curr.lChild = createBinaryTree(arr, start, mid-1);
//        curr.rChild = createBinaryTree(arr, mid+1, end);
//        return curr;
//
//
//    }
//
//    private Node insertNode(Node node, int v){
//        if (node == null){
//            node = new Node(v);
//        } else {
//            if (node.value > v){
//                node.lChild = insertNode(node.lChild, v);
//            } else {
//                node.rChild = insertNode(node.rChild, v);
//            }
//        }
//        return node;
//    }
//
//    private boolean findNode(Node node, int v){
//        while (node != null){
//            if (node.value == v){
//                return true;
//            } else if (node.value > v){
//                node = node.lChild;
//            } else {
//                node = node.rChild;
//            }
//        }
//        return false;
//    }
//
//
//
//
//
//    private void println(Node node){
//        if (node != null){
//            println(node.rChild);
//            System.out.print(node.value + " ");
//            println(node.lChild);
//        }
//
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////    int findMax(Node node){
////        if (node == null) return Integer.MIN_VALUE;
////
////        int res = node.value;
////        int lRes = findMax(node.lChild);
////        int rRes = findMax(node.rChild);
////
////        if (lRes > res){
////            res = lRes;
////        }
////
////        if (rRes > res){
////            res = rRes;
////        }
////        return res;
////    }
//
//    public static void main(String[] args){
//        Tree t = new Tree();
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
////        t.levelOrdinaryBinaryTree(arr);
////        t.printDepthFirst();
//
//        t.root = new Node(1);
//        t.root.lChild = new Node(2);
//        t.root.rChild = new Node(3);
//        t.root.lChild.lChild = new Node(4);
//        t.root.lChild.rChild = new Node(5);
//        t.root.rChild.lChild = new Node(6);
//        t.root.rChild.rChild = new Node(7);
//        System.out.println(t.findLCA(6,7).value);
//        System.out.println(t.findMax(t.root));
//        System.out.println(t.findMin(t.root));
//        System.out.println(t.searchValue(t.root, 9));
//        System.out.println(t.sumAllBT(t.root));
//        t.createBinaryTree(arr, 0, arr.length-1);
//        t.println(t.root);
//        System.out.println(t.insertNode(t.root, 12));
//        t.println(t.root);
//        System.out.println(t.findNode(t.root, 7));
//
//    }
//
//
//}
