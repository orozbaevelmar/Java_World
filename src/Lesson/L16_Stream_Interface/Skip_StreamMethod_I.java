package Lesson.L16_Stream_Interface;

// skip(i)-->пропускает элементов

import java.util.ArrayList;
import java.util.List;

public class Skip_StreamMethod_I {
    public static void main(String[] args) {
        Student7 st1=new Student7("Aktan", 'm', 22, 3,3.2);
        Student7 st2=new Student7("Aidinai", 'f', 25, 1,3.3);
        Student7 st3=new Student7("Bek", 'm', 19, 4,4.0);
        Student7 st4=new Student7("Eliza", 'f', 27, 2,2.1);
        Student7 st5=new Student7("Esen", 'm', 20, 1,1.0);
        Student7 st6=new Student7("Manas", 'm', 23, 1,3.0);

        List<Student7> list=new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        list.add(st6);

        list.stream().filter(e->e.getAge()>=20).forEach(e-> System.out.print(e));
        System.out.println("\n------------------------------------------");

        list.stream().filter(e->e.getAge()>=20).limit(2).forEach(e-> System.out.print(e));
        System.out.println("\n------------------------------------------");

        list.stream().filter(e->e.getAge()>=20).skip(2).forEach(e-> System.out.print(e));

    }
}
