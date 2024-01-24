package Lesson.L10_Collection.List1;

class TestLink{
    public static void main(String[] args) {
        LinkedList1 lk=new LinkedList1();
        lk.add(23);
        lk.add(85);
        lk.add(345);
        lk.add(5567);
        lk.toString();
    }
}


public class LinkedList1 {
    LinkedList1(){
        head=null;
    }
    class Node{
        public int data;
        public Node next;
        Node(int data){
            this.data=data;
        }
    }
    private Node head;

    public void add(int value){
        Node currentNode=head;
        Node new_Node=new Node(value);
        if (head == null) {
            head=new_Node;
        } else{
            while(currentNode.next != null){
                currentNode=currentNode.next;
            }
            currentNode.next=new_Node;
        }
    }

    @Override
    public String toString(){
        Node currentNode=head;
        if (head!=null) System.out.println(head.data);
        while (currentNode.next != null) {

                currentNode=currentNode.next;
                 System.out.println(currentNode.data);
            }
        return null;
    }
}
