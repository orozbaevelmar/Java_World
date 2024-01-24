package Lesson.L10_Collection.Queue;

// 1.PriorityQueue - это специальный вид очереди, в котором используеться натуральная сортировка или та, которую мы описываем,
//   с помощью Comparable или Comparator. Таким образом используеться тот элемент из очереди, приоритет которого выше.

import java.util.PriorityQueue;

public class PriorityQueueEx1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);
        priorityQueue.add(2);
        priorityQueue.add(20);
        priorityQueue.add(5);
        System.out.println(priorityQueue);
        System.out.println("--------------------");
        int len=priorityQueue.size();
        for (int i=0; i<len; i++){
            System.out.println(priorityQueue.remove());
        }
    }
}
