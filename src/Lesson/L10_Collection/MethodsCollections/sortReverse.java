package Lesson.L10_Collection.MethodsCollections;

import java.util.*;

public class sortReverse {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(0);
        list.add(-15);
        list.add(24);
        list.add(62);
        list.add(-54);
        list.add(453);
        list.add(46);

        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

    }
}
