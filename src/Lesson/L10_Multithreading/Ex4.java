package Lesson.L10_Multithreading;

public class Ex4 extends Thread {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Ex4 thread1 = new Ex4();
        thread1.start();


        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
