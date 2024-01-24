package Lesson.L10_Thread_Safe.SynchronizedCollections;

import java.util.*;

// Iterator - нужно выключить в синхронизированный блок; size() Lista может измениться, и может выбросить Exception

public class SynchronizedCollectionEx2 {
    public static void main(String[] args) throws InterruptedException{
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0; i<15; i++){
            arrayList.add(i);
        }
        List<Integer> synchList=Collections.synchronizedList(arrayList);
        Runnable runnable1= () -> {
            synchronized(synchList) { // Wird keine Exception mehr;
                Iterator<Integer> iterator = synchList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        };
        Runnable runnable2 = () ->
                synchList.remove(10);
        Thread thread1=new Thread(runnable1);
        Thread thread2=new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchList);
    }
}
