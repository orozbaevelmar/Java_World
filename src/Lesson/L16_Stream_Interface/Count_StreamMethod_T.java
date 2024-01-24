package Lesson.L16_Stream_Interface;

// count(t)-->return long-->length()

import java.util.stream.Stream;

public class Count_StreamMethod_T {
    public static void main(String[] args) {
        Stream<Integer>stream5=Stream.of(1,2,3,4,5,1,2,3);
 //       System.out.println(stream5.count()); // stream5 нельзя дважды использовать, выброшеться Exception
        System.out.println(stream5.distinct().count());
    }
}
