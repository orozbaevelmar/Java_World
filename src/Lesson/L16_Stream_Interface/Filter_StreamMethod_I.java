package Lesson.L16_Stream_Interface;

// Методы Stream не меняют саму коллекцию или массив, от которой был создан stream

// filter (i)

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter_StreamMethod_I {
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

        /*List <Student7> filterStude*/ list = list.stream().filter(element->
                element.getAge()>19 && element.getAvgGrade()<3.3).collect(Collectors.toList());
        System.out.println(list);

        Stream <Student7> myStream = Stream.of(st1,st2, st3,st4,st5);
        myStream.filter(element->
                element.getAge()>19 && element.getAvgGrade()<3.3).collect(Collectors.toList());
    }
}
class Student7{
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;
    Student7(String name, char sex, int age, int course, double avgGrade){
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.course=course;
        this.avgGrade=avgGrade;
    }

    @Override
    public String toString() {
        return "\nStudent7{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}

