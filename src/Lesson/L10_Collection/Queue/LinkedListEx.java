package Lesson.L10_Collection.Queue;

import java.util.*;

// Класс LinkedList имплементирует не только интерфейс List, но и интерфейс Deque
// 1.add --> Если Deque заполнен, то может выбросить Exception
// 1.offer --> не добавляеться и не выбрасываеться Exception
// 2.remove() --> Может выбросить Exception
// 2.poll() --> не выбрасывает Exception, вернеть null
// 3.element() -->возвращает какой элемент находиться первым, может выбросить Exception
// 3.peek() --> ohne Exception

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Aktan");
        queue.add("Maksat");
        queue.add("Saikal");
        queue.add("Denis");
        queue.add("Bek");
        System.out.println(queue);
        System.out.println("-----------------------");
        /*queue.remove(); // --FIFO--
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        // queue.remove();  на этом этапе выброситься Exception
        System.out.println(queue);*/

        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println("-----------------");
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println("-----------------");
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println("-----------------");
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println("-----------------");
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}
