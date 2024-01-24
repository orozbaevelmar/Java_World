package Lesson.L10_Thread_Safe.ConcurrenCollections;

import java.util.HashMap;
import java.util.Iterator;

public class Watch_ConcurrentHashMapEx1 {
    public static void main(String[] args) throws InterruptedException {
        HashMap<Integer, String> map=new HashMap<>();
        map.put(1, "Bek");
        map.put(2, "Aktan");
        map.put(3, "Akylai");
        map.put(4, "Manas");
        map.put(5, "Semetei");
        System.out.println(map);

        Runnable runnable1=()->{
            Iterator<Integer> iterator=map.keySet().iterator();
            while(iterator.hasNext()){
                try {
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                Integer i=iterator.next();
                System.out.println(i+":"+map.get(i));
            }
        };
        Runnable runnable2=()->{
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            map.put(6, "Elena");
        };
        Thread thread1=new Thread(runnable1);
        Thread thread2=new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);
    }
}
