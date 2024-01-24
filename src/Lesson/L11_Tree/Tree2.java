package Lesson.L11_Tree;

public class Tree2 {
    private Node head;
    public Tree2(){
        head=null;
    }
    public class Node{
        public int data;
        public Node next;
        Node(int data){
            this.data=data;
            next=null;
        }

    }
    public void add(int value) {
        Node newNode = new Node(value);
        Node currentNode = head;

        if(head == null) {
            head=newNode;
        }
        else{
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next=newNode;
        }
    }

     public void toStr(){
        Node currentNode = head;
        if (head != null){
            System.out.print(head.data+", ");
        }
        while (currentNode.next != null){
            currentNode=currentNode.next;
            System.out.print(currentNode.data+", ");
        }

    }
}
