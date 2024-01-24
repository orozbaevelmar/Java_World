package Lesson.L4_return_void;

public class Person1 {    // Модификатор доступа (public, private, protected)
        int height;     // Перед ними стоит по умолчанию Public
        float weight;  // Если написать Private или Protected, то это переменная Weight принадлежит только этому классу Person


        public void say(String str){
            System.out.println(str);
        }
    }
