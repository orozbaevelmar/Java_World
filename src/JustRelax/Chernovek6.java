package JustRelax;

import java.util.*;

public class Chernovek6 {

}
class Solution {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){}
        TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    TreeNode root;

    Solution() {
        root = null;
    }

    //(9) --> 10 5 15 3 7 13 18 1 6
    public TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (root.val > data) root.left = insert(root.left, data);
        else root.right = insert(root.right, data);
        return root;
    }

    public boolean search(int dataToBeSearched){
        return searchHelper(root, dataToBeSearched);
    }
    private boolean searchHelper(TreeNode root, int data){
        if (root==null) {
            return false;
        }
        else if (root.val == data) {
            return true;
        }
        else if(root.val > data){
            return searchHelper(root.left, data);
        }
        return searchHelper(root.right, data);
    }

    public void remove(int data){
        if (search(data)){
            root=removeHelper(root, data);
        }
        else System.out.println("Number could not find");
    }
    private TreeNode removeHelper(TreeNode root, int dataToBeDeleted){

        if (root.val > dataToBeDeleted) {
            root.left = removeHelper(root.left, dataToBeDeleted);
        }
        else if (root.val < dataToBeDeleted) {
            root.right = removeHelper(root.right, dataToBeDeleted);
        }
        else{ // data found
                if (root.left == null && root.right == null) {
                    return root = null;
                }
                else if (root.right != null){
                    root.val=successor(root.right);
                    root.right = removeHelper(root.right, root.val);
                }
                else {
                    root.val=predecessor(root.left);
                    root.left = removeHelper(root.left, root.val);
                }
        }
        return root;
    }
    private int successor(TreeNode root){
        while(root.left != null)
        {
            root=root.left;
        }
        return root.val;
    }

    private int predecessor(TreeNode root){
        while (root.right != null){
            root = root.right;
        }
        return root.val;
    }

    public void insertData(int data) {
        root = insert(root, data);
    }

    public void inOrder(TreeNode root) {
        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    private void preOrder(TreeNode root){
        if (root==null) return;

        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }


    /*TreeNode root1= null;*/

    private TreeNode addByLevel(TreeNode root, int[] arr, int le){  // count=0 le=1
        if (le > arr.length) return null;
        else if(arr[le-1] == 0){
            return null;
        }
        else {
            root = new TreeNode(arr[le-1]);
        }

        root.left = addByLevel(root.left, arr, 2*le);
        root.right = addByLevel(root.right, arr, 2*le+1);
        return root;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        /*int [] arr1 = {8,3,10,1,6,0,14,0,0,4,7,13}; // ANSWER 15
        s.root1 = s.addByLevel(s.root1, arr1,1);*/

        String traversal = "1-2--3---4-5--6---7";
        s.inOrder(s.root);
        System.out.println("\n-------");
        s.root = s.recoverFromPreorder(traversal);
        s.preOrder(s.root);
        System.out.println("\n-------");

    }

    public TreeNode recoverFromPreorder(String traversal) {
        char [] arr = traversal.toCharArray();
        TreeNode root = null;
        root = goStraight(root, 0, arr, 0);
        return root;
    }

    int num;
    private TreeNode goStraight(TreeNode root,  int count, char[] array, int dash){
        if(dash > num) return null;

        if(count >= array.length) {
            return null;
        }

        root = new TreeNode(array[count++]-'0');


        for(int dashCount=1; dashCount<array.length-2; dashCount++){
            if(array[++count] != '-' ) {
                num = dashCount;
                break;
            }
        }
        if (dash > num) return null;

        root.left =  goStraight(root.left, count, array, num);
        root.right = goStraight(root.right, count, array, num);
        return root;
    }
}
