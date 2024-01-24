package Lesson.L23_Comparable_Comparator_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WithoutComparableEx1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Tilek");
        list.add("Myky");
        list.add("Asyl");
        list.add("Bek");
        list.add("Bekjan");
        System.out.println("Pered sortirovkoi --> "+list);
        Collections.sort(list);
        System.out.println("Posle sortirovkoi --> "+list);
    }
}
