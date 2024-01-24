package Lesson.L10_Thread_Safe.SynchronizedCollections;

// Получаются из традиционных коллекций блогадаря их обертыванию
// Collections.synchronizedXYZ(коллекция) ---> XYZ==Map,Set,

import java.util.ArrayList;

public class UnsynchronizedCollectionEx {
    public static void main(String[] args) throws InterruptedException{
        while(true){
            ArrayList<Integer> source=new ArrayList<>();
            for (int i=0; i<5; i++){
                source.add(i);
            }
            ArrayList<Integer>target=new ArrayList<>();
            Runnable runnable = () -> {target.addAll(source);};

            Thread thread1 = new Thread(runnable);
            Thread thread2 = new Thread(runnable);
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
            if (target.size()==5) {
                System.out.println(target);
                break;
            }
        }
        // target должен быть {0,1,2,3,4,0,1,2,3,4} так
    }
}
