package Lesson.L10_Multithreading;

public class SleepEx {
    public static void main(String[] args) throws InterruptedException {
        for (int i=5; i>0; i--){
            System.out.println(i);
            Thread.sleep(2000);
        }
        System.out.println("Поехали!!!");
    }
}
