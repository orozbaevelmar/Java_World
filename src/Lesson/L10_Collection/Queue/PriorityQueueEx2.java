package Lesson.L10_Collection.Queue;

import java.util.*;

public class PriorityQueueEx2 {
    public static void main(String[] args) {
        Student8 st1 = new Student8("Aktan", 3);
        Student8 st2 = new Student8("Kasym", 4);
        Student8 st3 = new Student8("Baiaman", 2);
        Student8 st4 = new Student8("Saikal", 1);
        Student8 st5 = new Student8("Manas", 5);

        PriorityQueue<Student8> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        priorityQueue.add(st5);
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}

class Student8 implements Comparable<Student8> {
    String name;
    int course;

    public Student8(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student8{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }


    public int compareTo(Student8 anotherStudent) {
        return this.course - anotherStudent.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student8 student8 = (Student8) o;
        return course == student8.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
