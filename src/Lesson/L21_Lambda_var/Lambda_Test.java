package Lesson.L21_Lambda_var;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
//41.21
public class Lambda_Test {
    public static void main(String[] args) {
        List <String> list=List.of("Privet", "poka", "kak dela?", "alles ok");
        for (String s:list){
            System.out.print(s+" ");
        }
        System.out.println("\n--------------");
        list.forEach(s-> System.out.print(s+" "));
        System.out.println("\n--------------");

        ArrayList <Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        System.out.println(al);
        al.removeIf(element->element % 3 == 0);
        System.out.println(al);

        Predicate<Integer> p=element->element % 2 ==0;
        al.removeIf(p);
        System.out.println(al);
        System.out.println("--------------");

        al.add(0,5);
        al.add(0,10);
        al.add(0,0);
        al.add(al.size(), 4);
        al.add(al.size(),2);
        System.out.println(al);
        al.sort((x,y)->x.compareTo(y));
        System.out.println("increasing="+al);

        al.sort((x,y)->-x.compareTo(y));
        al.sort((x,y)->y.compareTo(x));
        System.out.println("decreasing="+al);


        System.out.println("--------------");
        List <String> list1=List.of("Privet", "poka", "kak dela?", "alles ok");
        String str="abcdef";
        /* WRONG str="fds";*/
        for (String s:list1){
            /*  WRONG  Predicate<String> predicate=s->s.length()>4;  Same variables*/
            Predicate<String> predicate=z->z.length()>4;

            Predicate<String> predicate2=(String z)->{
                System.out.println(str.length());
                return z.length()>4;};
        }
        /* WRONG str="fds";*/
    }
}
