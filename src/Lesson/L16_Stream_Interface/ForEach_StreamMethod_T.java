package Lesson.L16_Stream_Interface;

import java.util.Arrays;

// forEach (t) --> возвращает void. collect здесь не работает
// :: (Метод reference) ссылка на метод

public class ForEach_StreamMethod_T {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};

        Arrays.stream(array).forEach(el -> {
            el *= 2;
            System.out.print(el + "   ");
        });
        System.out.println("\n---------------------");

        Arrays.stream(array).forEach(System.out::println);
        System.out.println("\n---------------------");
        Arrays.stream(array).forEach(Utils::myMethod);
        Arrays.stream(array).forEach(el -> Utils.myMethod(el));
        System.out.println("\n---------------------");

    }
}

class Utils {
    public static void myMethod(int a) {
        a = a + 5;
        System.out.println("Element = " + a);
    }
}