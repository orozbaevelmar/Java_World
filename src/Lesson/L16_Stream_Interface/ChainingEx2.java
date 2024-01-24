package Lesson.L16_Stream_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ChainingEx2 {
    public static void main(String[] args) {
        Student11 st1=new Student11("Aktan", 'm', 22, 3,3.2);
        Student11 st2=new Student11("Aidinai", 'f', 25, 1,3.3);
        Student11 st3=new Student11("Bek", 'm', 19, 4,4.0);
        Student11 st4=new Student11("Eliza", 'f', 24, 2,2.1);
        Student11 st5=new Student11("Esen", 'm', 20, 1,1.0);

        List<Student11> list=new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        list.stream().map(element->
                {
                    element.setName(element.getName().toUpperCase());
                    return element;
                })
                .filter(element->element.getSex()=='f')
                .sorted((x, y)->x.getAge()- y.getAge())
                .forEach(element-> System.out.println(element));
    }
}

class Student11 {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;
    Student11(String name, char sex, int age, int course, double avgGrade){
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
