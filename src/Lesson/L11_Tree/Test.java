package Lesson.L11_Tree;

public class Test {
    public static void main(String[] args) {
        Tree2 t=new Tree2();
        t.add(4);
        t.add(97);
        t.add(67);
        t.add(32);
        t.add(456);
        t.add(23);

        t.toStr();
    }


     private static class Node {
        public static void main(String[] args) {
           Node x=new Node(1, null);
           Node y=new Node(3, new Node(8, null));
            System.out.println(y.getNext().getData());
        }
        int data;
        Node next;
        Node(int data, Node next){
            this.data=data;
            this.next=next;
        }
        public int getData(){return data;}
        public Node getNext(){return next;}
    }
}
