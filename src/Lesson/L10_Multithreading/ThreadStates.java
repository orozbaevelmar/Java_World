package Lesson.L10_Multithreading;

// Thread states 3-> New----Runnable(в состоянии выполнении)-----Terminated(работа потока завершена)
//                               1.ready   2.running

public class ThreadStates {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread thread=new Thread(new Worker5());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());

        thread.join();
        System.out.println(thread.getState());
        System.out.println("Method main ends");
    }
}
class Worker5 implements Runnable{
    @Override
    public void run() {
        System.out.println("Work begins");
        try{
            Thread.sleep(2500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Work ends");
    }
}