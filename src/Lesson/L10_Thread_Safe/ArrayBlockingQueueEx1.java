package Lesson.L10_Thread_Safe;

import java.util.concurrent.ArrayBlockingQueue;

// 1.ArrayBlockingQueue-потокобезопасная очередь с ограниченным размером(capacity restricted)
//   обязательно нужно указать размер
// 2. Обычно один или несколько потоков добавляют элементы в конец очереди, а другой или другие потоки забирают элементы из начало очереди
public class ArrayBlockingQueueEx1 {
    public static void main(String[] args) {
        ArrayBlockingQueue <Integer> queue=new ArrayBlockingQueue<>(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        System.out.println("--------------------------");
        queue.offer(5);
        System.out.println("with pool: "+queue);
        System.out.println("--------------------------");
        queue.add(5);
        System.out.println(queue);
    }
}
