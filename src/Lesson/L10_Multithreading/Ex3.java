package Lesson.L10_Multithreading;

// Если MyThread1 уже extends другой класс (ex. class Car), то мы не можем использовать его как поток(не можем extends Thread)
// тогда мы можем сделать его потоком, как ниже

public class Ex3 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread5());
        Thread thread2 = new Thread(new MyThread6());
        thread1.start();
        thread2.start();

    }
}

class MyThread5 extends Car implements Runnable {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread6 extends Car implements Runnable {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
class Car{}