package Lesson.L22_Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;

// jvm принимает ArrayList list1=new ArrayList(); поэтому появляются некотюпроблемы с Overriding, Override
// jvm кастит значении int i=(Integer)list1.get(0);

public class TypeErasure {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        ArrayList list1=new ArrayList();

        int i=(Integer)list1.get(0);

    }

    /*public void xyz(MyInfo <String> info){
        String s= info.getValue();
    }
    public void xyz(MyInfo <Integer> info){
        Integer i= info.getValue();
    }*/
    // abc(MyInfo info) {для JVM их sign выглядет одинаково}

}
/*class Parent{
    public void xyz(MyInfo <String> info){
        String s= info.getValue();
    }
}
class Child extends Parent{
    public void xyz(MyInfo <Integer> info){
        Integer i= info.getValue();
    }
}*/

class MyInfo<T>{
    private T value;
    public MyInfo(T value){
        this.value=value;
    }
    public String toString(){
        return "[{"+value+"}]";
    }
    public T getValue(){
        return value;
    }
}