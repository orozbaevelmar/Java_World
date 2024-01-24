package Lesson.L10_Collection.List1;

// Vector - устаревший synchronized класс. В своей основе содержит массив элементов Object. Не рекомендован для использования
// add
// get
// remove
// firstElement
// lastElement

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.add("Bek");
        vector.add("Aktan");
        vector.add("Sezim");
        vector.add("Elgiz");
        vector.add("Samat");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));
    }
}
