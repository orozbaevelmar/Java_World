package Lesson.L10_Collection.Queue;
import java.util.*;

// 1.Deque  -  Double ended queue(двунаправленная очередь). В такой очереди элементы могут
//   использоваться с обоих концов. Здесь рабоатют оба правило-FIFO и LIFO
// Интерфейс Deque реализуеться классами LinkedList и ArrayDeque.

// 1.addFirst() ---addLast()  --->maybe Exception
//   offerFirst() --- offerLast()  --->without Exception
// 2.removeFirst() --- removeLast() --->maybe Exception
//   pollFirst() --- pollLast() --->without Exception
// 3.getFirst() --- getLast() --->maybe Exception
//   peekFirst() --- peekLast() --->without Exception

public class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(7);
        deque.offerFirst(1);
        deque.offerLast(8);
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.removeFirst());
        System.out.println(deque);
        System.out.println("-----------------------");
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.removeLast());
        System.out.println(deque);
        System.out.println("-----------------------");
        System.out.println(deque.pollFirst());
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque);


    }
}
