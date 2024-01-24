package Lesson.L11_Tree;

//   Binary Search Tree = A tree data structure, where each node is greater than it's left child, but less than it's right.

//                        benefit: easy to locate a node when they are in this order

//                        time complexity: best case 0(log n)
//                                         worst case 0(n)

//                        space complexity: 0(n)

public class BinarySearchTree {

    Node root;

    public void insert(Node node){
        root=insertHelper(root, node);
    }
    private Node insertHelper(Node root, Node node){
        int data=node.data;

        if (root==null){
            root=node;
            return root;
        }
        else if (data < root.data){
            root.left = insertHelper(root.left, node);
        }
        else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }
    public void display(){displayHelper(root);}
    private void displayHelper(Node root){

        if (root != null){
            displayHelper(root.left);
            System.out.print(root.data+" ");
            displayHelper(root.right);
        }
    }
    public boolean search(int data){
        return searchHelper(root, data);
    }
    private boolean searchHelper(Node root, int data){

        if (root == null){
            return false;
        }
        else if (root.data == data) {
            return true;
        }
        else if (root.data > data) {
            return searchHelper(root.left, data);
        }
        else {
            return searchHelper(root.right, data);
        }
    }
    public void remove(int data){
        if (search(data)) {
            removeHelper(root, data);
        }
        else {
            System.out.println(data + " could not remove,"+data+" does not exist in Binary Tree!");
        }
    }
    private Node removeHelper(Node root, int data){
        if (root == null) {
            return root;
        }
        else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        }
        else if (data > root.data){
            root.right = removeHelper(root.right, data);
        }
        else { // node found
            if (root.left == null && root.right == null){
                root=null;
            }
            else if (root.right != null ) { //find a successor to replace this node
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            else { // find a predecessor to replace this node
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }
    private int successor(Node root){ //find least value below the right child of this root node
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }
    private int predecessor(Node root){ //find greatest value below the left child of this root node
        root=root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }
}
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;

    }
}

class Main{
    public static void main(String[] args) {

        BinarySearchTree tree=new BinarySearchTree();

        tree.insert(new Node(10));
        tree.insert(new Node(5));
        tree.insert(new Node(15));
        tree.insert(new Node(3));
        tree.insert(new Node(8));
        tree.insert(new Node(13));
        tree.insert(new Node(30));
        tree.insert(new Node(11));
        tree.insert(new Node(14));
        tree.insert(new Node(25));
        tree.insert(new Node(35));

        tree.display();
        System.out.println("\n-----------------");

        System.out.println(tree.search(0));
        System.out.println(tree.search(8));
        System.out.println("-----------------");

        tree.remove(0);
        tree.remove(15);
        tree.display();
        System.out.println("\n-----------------");
    }
}