package Lesson.L16_Stream_Interface;

// distinct(i)-->returns a stream of unique elements-checks using the equals() method

import java.util.stream.Stream;

public class Distinct_StreamMethod_I {
    public static void main(String[] args) {
        Stream<Integer> stream5=Stream.of(1,2,3,4,5, 1,2,3);
        stream5.distinct().forEach(System.out::println);
    }
}
