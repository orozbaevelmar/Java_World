package Lesson.L16_Stream_Interface;

// min(t) -->return Optional // need to method get() use
// max(t)

import java.util.ArrayList;
import java.util.List;

public class Min_Max_StreamMethod_T {
    public static void main(String[] args) {
        Student7 st1=new Student7("Aktan", 'm', 22, 3,3.2);
        Student7 st2=new Student7("Aidinai", 'f', 25, 1,3.3);
        Student7 st3=new Student7("Bek", 'm', 19, 4,4.0);
        Student7 st4=new Student7("Eliza", 'f', 27, 2,2.1);
        Student7 st5=new Student7("Esen", 'm', 20, 1,1.0);

        List<Student7> list=new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        Student7 min=list.stream().min((el1, el2)->el1.getAge()-el2.getAge()).get();
        Student7 max=list.stream().max((el1, el2)->el1.getAge()-el2.getAge()).get();

        System.out.println("min = "+min);
        System.out.println("max = "+max);
    }
}
