package Lesson.L10_Multithreading;

// join метод приостановливает работу метода в котором вызван, до того те потоки которые thread.join закончили свою работу

public class JoinEx1 {
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

    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(new MyRunnable5());
        SleepEx2 thread2=new SleepEx2();
        thread1.start();
        thread2.start();

        /*thread1.join();
        thread2.join();*/
        System.out.println("Konec!");

        thread1.join();
        thread2.join();
        System.out.println("Nachalo");

    }
}
class MyRunnable5 implements Runnable{
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