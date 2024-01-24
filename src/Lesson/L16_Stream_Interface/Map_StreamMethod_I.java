package Lesson.L16_Stream_Interface;

import java.util.*;
import java.util.stream.Collectors;

// Stream - это поселдовательность элементов, поддерживающих последовательные и паралельные операции над ними
// Stream - грубо говоря поток данных, тех которых содержит коллекция
// map (i)

// ПОТОК- list.stream().map(element1->element1.length()) ---  set.stream().map(e->e.length());
// collect - чтобы преобразовать поток в лист
// toArray - чтобы преобразовать потот в массив

public class Map_StreamMethod_I {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");

        /*for (int i = 0; i < list.size(); i++) {
            list.set(i, String.valueOf(list.get(i).length()));
        }*/
        List<Integer> list2=list.stream().map(element1->element1.length()).collect(Collectors.toList());
        /*list.stream().map(element-> element.length());*/

        System.out.println(list);
        System.out.println(list2);
        System.out.println("------------------------");

        int[] array={5,9,3,8,1, 36};
        array=Arrays.stream(array).map(element-> {return
            element % 3 == 0 ? element/=3 : element;
        }).toArray();

        System.out.println(Arrays.toString(array));
        System.out.println("------------------------");System.out.println("------------------------");


        Set<String> set=new TreeSet<>();
        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");
        System.out.println(set);
        Set<Integer> set5 = set.stream().map(e->e.length()).collect(Collectors.toSet());
        List<Integer> list5 = set.stream().map(e->e.length()).collect(Collectors.toList());
        System.out.println("set = "+ set5); // Mit Sort
        System.out.println("Set to List = "+list5); // kein Sort
        System.out.println("------------------------");


    }
}
