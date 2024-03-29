package Lesson.L22_Generics;

import java.util.ArrayList;

public class Generics2 {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(10);
        al1.add(30);
        al1.add(140);
        ArrayList<String> al2=new ArrayList<>();
        al2.add("a");
        al2.add("b");
        al2.add("c");

        int a=GenMethod.getSecondElement(al1);
        String str=GenMethod.getSecondElement(al2);
        System.out.println(a);
        System.out.println(str);
    }
}
class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}
