package Lesson.L22_Generics;

import java.util.ArrayList;
import java.util.List;

// <String> --->Generics
// <T> --->Type place folder;

public class Generics1 {
    public static void main(String[] args) {
        Info<String> info1=new Info<>("privet");
        System.out.println(info1);
        String s=info1.getValue();

        Info<Integer> info2=new Info<>(100);
        System.out.println(info2);
        Integer in=info2.getValue();
    }
}
class Info<T>{
    private T value;
    public Info(T value){
        this.value=value;
    }
    public String toString(){
        return "[{"+value+"}]";
    }
    public T getValue(){
        return value;
    }
}