package Lesson.L10_Multithreading;

// Многопоточность-это принцип построения программы, при котором несколько блоков кода могут выполняться одновременно
// Основные цели --> 1)Производительность  2)Concurrency

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Privet");
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
        System.out.println("poka");
    }
}
