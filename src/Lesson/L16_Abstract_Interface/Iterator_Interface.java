package Lesson.L16_Abstract_Interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Interface {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        Iterator<String> iterator1=list.iterator();
        while(iterator1.hasNext()){
            System.out.print(iterator1.next()+"   ");
        }
        System.out.println("\n-----------------------");

        Iterator<String> iterator2=list.iterator();
        while (iterator2.hasNext()){
            iterator2.next();
            iterator2.remove();
        }
        System.out.println(list);
    }
}
