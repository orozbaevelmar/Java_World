package Lesson.L10_Thread_Safe.ConcurrenCollections;

// 1.ConcurrentHashMap-имплементирует интерфейс ConcurrentHashMap, который в свою очередь происходит от интерфейса Map.
// 2.В ConcurrentHashMap любое количество потоков может читать элементы не блокирую его.
// 3.В ConcurrentHashMap, благодаря его сегментированию, при изменении какого-либо элемента блокируется толко bucket, в
//   котором он находиться (В synchronized HashMap такого нельзя было делать)
// 4.В ConcurrentHashMap ни key, ни value не могут быть null

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentHashMapEx1 {
    public static void main(String[] args) throws InterruptedException  {
        ConcurrentHashMap<Integer, String> map=new ConcurrentHashMap<>();
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
