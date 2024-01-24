package Lesson.L16_Stream_Interface;


// reduce (t) --> Optional_Interface
// get();
// reduce - уменьшить

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Reduce_Stream_T {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accumlator, element)-> accumlator*element).get();
        System.out.println(result);
        // 5, 8, 2, 4, 3
        // accumlator = 5  40  80  320  960
        // element    = 8  2   4    3

        System.out.println("----------------------");
        List<Integer> list100=new ArrayList<>();

        Optional<Integer> o = list100.stream().reduce((accumlator, element)-> accumlator*element);
        if (o.isPresent()) {
            System.out.println(o.get());
            int g=o.get();
        }
        else System.out.println("Not present");
        System.out.println("----------------------");

        int result100 = list100.stream().reduce((accumlator, element)-> accumlator*element).get();
        System.out.println(result100);
    }
}
