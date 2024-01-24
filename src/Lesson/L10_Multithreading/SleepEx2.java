package Lesson.L10_Multithreading;

public class SleepEx2  extends Thread{
    public void run(){
        for (int i=1; i<=10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        Thread thread1=new Thread(new MyRunnable1());
        SleepEx2 thread2=new SleepEx2();
        thread1.start();
        thread2.start();

        System.out.println("Konec!");
    }
}
class MyRunnable1 implements Runnable{
    public void run(){
        for (int i=1; i<=10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
