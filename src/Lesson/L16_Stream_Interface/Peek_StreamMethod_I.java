package Lesson.L16_Stream_Interface;

import java.util.stream.Stream;

// Peek(i)--похож на forEach(t). Но выступает в роле Intermediate, помогает нам посмотреть что происходит на разных этапах метод Chaining

public class Peek_StreamMethod_I {
    public static void main(String[] args) {
        Stream<Integer> stream5=Stream.of(1,2,3,4,5,1,2,3);
        /*System.out.println(stream5.distinct().forEach(System.out::println).count());  WRONG*/
        System.out.println(stream5.distinct().peek(System.out::println).count());
    }
}
