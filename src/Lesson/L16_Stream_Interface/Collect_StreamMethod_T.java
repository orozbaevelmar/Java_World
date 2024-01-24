package Lesson.L16_Stream_Interface;

// collect(t)-мы использовали collect, чтобы поток преобразовать в коллекцию
//              -1-groupingBy()
// collect(t)--
//              -2-partitioningBy()


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect_StreamMethod_T {
    public static void main(String[] args) {
        Student7 st1=new Student7("Aktan", 'm', 22, 3,3.2);
        Student7 st2=new Student7("Aidinai", 'f', 25, 1,3.3);
        Student7 st3=new Student7("Bek", 'm', 19, 4,4.0);
        Student7 st4=new Student7("Eliza", 'f', 27, 2,2.1);
        Student7 st5=new Student7("Esen", 'm', 20, 1,1.0);

        List<Student7> list=new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

/* -1- groupingBy() */
        Map<Integer, List<Student7>>map1=list.stream().map(e-> {
            e.setName(e.getName().toUpperCase());
            return e;})
                .collect(Collectors.groupingBy(el->el.getCourse()));

        for (Map.Entry <Integer, List<Student7>> entry:map1.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("----------------------------------------------------------------");

/* -2- partitioningBy() */
        Map<Boolean, List<Student7>>map2=list.stream()
                .collect(Collectors.partitioningBy(el->el.getAvgGrade()>3));

        for (Map.Entry <Boolean, List<Student7>> entry:map2.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
