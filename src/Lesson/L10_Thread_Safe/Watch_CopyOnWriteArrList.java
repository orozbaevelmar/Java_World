package Lesson.L10_Thread_Safe;

import java.util.ArrayList;
import java.util.Iterator;

public class Watch_CopyOnWriteArrList {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> list=new ArrayList<>();
        list.add("Bek");
        list.add("Aktan");
        list.add("Asyl");
        list.add("Tasch");
        list.add("Tilek");
        System.out.println(list);

        Runnable runnable1=()->{
            Iterator<String> iterator=list.iterator();
            while(iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(iterator.next());
            }
        };

        Runnable runnable2=()->{
            Iterator<String> iterator=list.iterator();
            while(iterator.hasNext()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.remove(4);
                list.add("Bakyt");
            }
        };
        Thread thread1=new Thread(runnable1);
        Thread thread2=new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(list);
    }
}
