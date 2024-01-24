package Lesson.L16_Stream_Interface;

import java.util.ArrayList;
import java.util.List;

// reduce(1, (accumlator, element)-> accumlator*element)
//        |_> когда вот так записан, не вернетсься никогда null(Exception) значение, и не нужно метод get()
// и возвращает Integer

public class Reduce_StreamEx2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accumulator, element)-> accumulator*element).get();
        // 5, 8, 2, 4, 3
        // accumulator = 5  40  80  320  960
        // element     = 8  2   4    3
        System.out.println(result);
        System.out.println("---------------------");

        int result2 = list.stream().reduce(1, (accumulator, element)-> accumulator*element);
        System.out.println(result2);
        // 5, 8, 2, 4, 3
        // accumulator = 1  5  40  80  320  960
        // element     = 5  8  2   4    3

        System.out.println("---------------------");
        List<Integer> list5=new ArrayList<>();
        int result3 = list5.stream().reduce(1, (accumulator, element)-> accumulator*element);
        System.out.println(result3);

        System.out.println("---------------------");
        List<String> list9=new ArrayList<>();
        list9.add("privet");
        list9.add("kak dela?");
        list9.add("Ok");
        list9.add("poka");

        String result9 = list9.stream().reduce((a, e)->a+" "+e).get();
        System.out.println(result9);
    }
}
