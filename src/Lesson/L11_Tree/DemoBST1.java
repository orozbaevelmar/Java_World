package Lesson.L11_Tree;

// Left  Node = 2 * i
// Right Node = 2 * i + 1
// Parent Node = [i/2] --> return int Z.B. 5/2=2;

// delete = O(n);
// insert =

import java.util.Scanner;
import java.util.Arrays;

public class DemoBST1 {
    public class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    TreeNode root;

    public DemoBST1(){
        root=null;
    }

    public TreeNode insert(TreeNode root, int dataToBeInserted){
        if (root==null) {
            root=new TreeNode(dataToBeInserted);
            return root;
        }
        if (root.data>dataToBeInserted){
            root.left=insert(root.left, dataToBeInserted);
        }
        else if (root.data<dataToBeInserted){
            root.right=insert(root.right, dataToBeInserted);
        }
        return root;
    }

    public TreeNode search(TreeNode root, int dataToBeSearched){
        if (root==null  || root.data==dataToBeSearched) return root;

        if (root.data>dataToBeSearched){
            return search(root.left, dataToBeSearched);
        }
        // else
        return search(root.right, dataToBeSearched);
    }

    public void inOrder(TreeNode root){
        if (root==null) return; // left - print - right

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    private void preOrder(TreeNode root){
        if (root==null) return; // print - left - order
        
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(TreeNode root){
        if (root==null) return; // left - right - print

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public void insertIntoTree(int dataToBeInserted){
        root=insert(root, dataToBeInserted);
    }

    public TreeNode searchTree(int dataToBeInserted){
        return search(root, dataToBeInserted);
    }

    public void inOrderTraversal(){
        inOrder(root);
    }

    public void preOrderTraversal(){
        preOrder(root);
    }

    public void postOrderTraversal(){
        postOrder(root);
    }


    public TreeNode arrToBST=null;
    public TreeNode sortedArrayToBalancedBST(TreeNode root, int arr[], int start, int end) {
        if (start>end) return null;
//// Sorted Array to Balanced BST By Finding The middle element
        int mid = (start+end)/2;
        root=new TreeNode(arr[mid]);

        root.left = sortedArrayToBalancedBST(root, arr, start, mid-1);
        root.right = sortedArrayToBalancedBST(root, arr, mid+1, end);
        return root;
    }

    public int heightOfTree(TreeNode root){
        if (root == null) return 0;

        else {
            int leftHeight = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
            // return 1 + (leftHeight > rightHeight ? leftHeight : rightHeight);
        }
    }

    public static void main(String[] args) {
        DemoBST1 bst=new DemoBST1();

        int [] arr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        bst.arrToBST=bst.sortedArrayToBalancedBST(bst.arrToBST, arr, 0, arr.length-1);
        /*System.out.println("Sorted array to BST = ");*/
        System.out.println(bst.heightOfTree(bst.arrToBST));
        System.out.println();
        bst.preOrder(bst.arrToBST);
        System.out.println("\n----------------------------");

        int n, num;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter how many numbers to be input");
        // (1) 7
        // (2) 5
        n=scan.nextInt();
        System.out.println("Enter "+n+" numbers : ");
        // (1) 25 20 5 7 12 15 21
        // (2) 20 5 22 1 7
        for (int i=0; i<n; i++){
            num=scan.nextInt();
            bst.insertIntoTree(num);
        }
        System.out.println("Tree insertion done");

        System.out.println("----------------------------");
        System.out.println("Enter number to be searched");
        n=scan.nextInt();
        if (bst.searchTree(n)!=null){
            System.out.println("Number found");
        }else{
            System.out.println("Number not found");
        }

        System.out.println("----------------------------");
        System.out.println("Inorder traversal of binary search tree");
        bst.inOrderTraversal();

        System.out.println("\n----------------------------");
        System.out.println("Preorder traversal of binary search tree");
        bst.preOrderTraversal();

        System.out.println("\n----------------------------");
        System.out.println("Postorder traversal of binary search tree");
        bst.postOrderTraversal();

    }
    // 5.04
}
