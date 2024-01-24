package Lesson.L10_Multithreading;

// Создание
// class MyRunnable implements Runnable{public void run(){some code}}
// Запуск
// new Thread(new MyRunnable() ).start();

// Из-за того,что в Java отсутствует множественное наследование, чаще используют 2-ой вариант.

public class Ex6 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Privet");
            }
        }).start();

        System.out.println("--------------");

        new Thread( () -> System.out.println("Privet")).start();
    }
}

