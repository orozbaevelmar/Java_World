package JustRelax;

import Lesson.L10_Collection.List1.LinkedList1;

public class Chernovek7 {
    public static void main(String[] args) {
        Chernovek7 ch=new Chernovek7();
        ch.add();

    }
    Chernovek7(){
        head=null;
    }
    Node head;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    Node current=head;
    private void add(){
        head=new Node(11);
        current=new Node(11);
        current.next=new Node(10);
        current.next.next=new Node(15);

        Chernovek7 ch=new Chernovek7();
        ch.toString(head);
        System.out.println("\n-----------------");
        ch.toString(current);
    }


    public String toString(Node head){
        Node currentNode=head;
        if (head!=null) System.out.println(head.val);
        while (currentNode.next != null) {

            currentNode=currentNode.next;
            System.out.println(currentNode.val);
        }
        return null;
    }
}