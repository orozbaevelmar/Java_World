package Lesson.L10_Thread_Safe;

import java.util.concurrent.ArrayBlockingQueue;

// put -->Producer (only put)
// take -->Consumer(take and delete)

public class ArrayBlockingQueueEx2 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue=new ArrayBlockingQueue<>(4);

        // Producer
        new Thread(()->{
            int i=0;
            while(true){
                try {
                    queue.put(++i);
                    System.out.println("Producer dobavil: "+i+"  "+queue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        // Consumer
        new Thread(()->{
            while(true){
                try {
                    Integer j=queue.take();
                    System.out.println("Consumer zabral: "+j+"  "+queue);
                    Thread.sleep(9000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
