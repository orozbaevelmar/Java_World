package Lesson.L10_Multithreading;

// join() параметр можно дать значение, тогда поток main должен подождать ? секунды или же до завершения того потока.
// Кто из них будет первым, тот и случиться

public class JoinEx2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread thread=new Thread(new Worker());
        thread.start();

        thread.join(4000);     // 4000>2500
        System.out.println("Method main ends");

        System.out.println("-----------------------");
        Thread thread5=new Thread(new Worker());
        thread5.start();
        thread5.join(1500); // за 2500 мс поток thread не успеет закончить свою работу, main начнет свою работу после 1500 мс
        System.out.println("Method main ENDS");

    }
}
class Worker implements Runnable{
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