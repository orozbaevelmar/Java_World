package Lesson.L16_Stream_Interface;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// filter() не обработалься, он не обрабатываеться до тех пор пока не используеться Terminal methods
// collect относиться к Terminal methods
public class ChainingEx3 {
    public static void main(String[] args) {
        Stream<Integer>stream1= Stream.of(1,2,3,4,5,1,2,3);
        stream1.filter(el->{
            System.out.println("!!!"); // должен был выйти на экран stream1.length раз, но не вышло
            return el%2==0;
        });

        System.out.println("------------------");
        Stream<Integer>stream2= Stream.of(1,2,3,4,5,1,2,3);
        stream2.filter(el->{
            System.out.println("!!!");
            return el%2==0;
        }).collect(Collectors.toList());
    }
}
