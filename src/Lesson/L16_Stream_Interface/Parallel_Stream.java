package Lesson.L16_Stream_Interface;

// Parallel stream-это возможность использования нескольких ядер процессора при выполнении каких-либо операций со stream.
// a) list.parallelStream().

// b) Stream <T> s = Stream.of(...);
//    s.parallel()

import java.util.ArrayList;
import java.util.List;

public class Parallel_Stream {
    public static void main(String[] args) {

        // 1,2,3,4 ... 1 000 000 000
        // 1-ядра 1---250 000 000
        // 2-ядра 250 000 001 --- 500 000 000
        // 3-ядра 500 000 000 --- 750 000 000
        // 4-ядра 750 000 001 --- 1 000 000 000

        List<Double> list=new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult1=list.stream()
                .reduce((accumlator, element)->accumlator+element).get();
        System.out.println("sumResult1 = "+sumResult1);

        double sumResult2=list.parallelStream()
                .reduce((accumlator, element)->accumlator+element).get();
        System.out.println("sumResult2 = "+sumResult2);
        System.out.println("------------------");

        double divisionResult1=list.stream()
                .reduce((accumlator, element)->accumlator/element).get();
        System.out.println("divisionResult1 (Stream) = "+divisionResult1+"  -->True");

        double divisionResult2=list.parallelStream()
                .reduce((accumlator, element)->accumlator/element).get();
        System.out.println("divisionResult2 (parallelStream) = "+divisionResult2+"  -->False");
        System.out.println("------------------");
    }
}
