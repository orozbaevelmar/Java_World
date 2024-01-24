package Lesson.L16_Stream_Interface;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// mapToInt(i)-->return (int Stream)
// boxed()-->конвертирует значение int в значение Integer

// maptoInt()---->sum(), average(), min(), max()

public class MapToInt_StreamMethod_I {
    public static void main(String[] args) {
        Student7 st1=new Student7("Aktan", 'm', 22, 3,3.2);
        Student7 st2=new Student7("Aidinai", 'f', 25, 2,3.3);
        Student7 st3=new Student7("Bek", 'm', 19, 4,4.0);
        Student7 st4=new Student7("Eliza", 'f', 27, 1,2.1);
        Student7 st5=new Student7("Esen", 'm', 20, 4,1.0);

        List<Student7> list=new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        List<Integer> coursesList=list.stream()
                .mapToInt(el->el.getCourse())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(coursesList);
        System.out.println("----------------------");

        List<Double> coursesList1=list.stream()
                .mapToDouble(el->el.getAvgGrade())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(coursesList1);
        System.out.println("----------------------");

        int sum = list.stream().mapToInt(el->el.getCourse()).sum();
        System.out.println(sum);
        System.out.println("----------------------");

        double average = list.stream().mapToInt(el->el.getCourse()).average().getAsDouble();
        System.out.println(average);
        System.out.println("----------------------");

        int min = list.stream().mapToInt(el->el.getCourse()).min().getAsInt();
        System.out.println(min);
        System.out.println("----------------------");

        int max = list.stream().mapToInt(el->el.getCourse()).max().getAsInt();
        System.out.println(max);
        System.out.println("----------------------");
    }
}
