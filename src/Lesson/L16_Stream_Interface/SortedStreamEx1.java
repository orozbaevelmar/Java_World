package Lesson.L16_Stream_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortedStreamEx1 {
    public static void main(String[] args) {
        int[] array={3,8,1,5, 9,12,4,21,81,7,18};
        array=Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

        Student9 st1=new Student9("Esen", 'm', 22, 3,3.2);
        Student9 st2=new Student9("Aidinai", 'f', 25, 1,3.3);
        Student9 st3=new Student9("Eliza", 'm', 19, 4,4.0);
        Student9 st4=new Student9("Bek", 'f', 27, 2,2.1);
        Student9 st5=new Student9("Aktan", 'm', 20, 1,1.0);

        List<Student9> list=new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        System.out.println(list);

        System.out.println("-------------------");
        list=list.stream().sorted((x,y)->
                x.getName().compareTo(y.getName())
                ).collect(Collectors.toList());
        System.out.println(list);
    }
}
class Student9 {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;
    Student9(String name, char sex, int age, int course, double avgGrade){
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