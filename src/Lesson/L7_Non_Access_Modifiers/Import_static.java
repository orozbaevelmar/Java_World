package Lesson.L7_Non_Access_Modifiers;

import static Lesson.L7_Non_Access_Modifiers.Static.*; // импортировали статик count

public class Import_static {
    public static void main(String[] args) {
        int a=count; // важно public static
        System.out.println(a);
    }
}
