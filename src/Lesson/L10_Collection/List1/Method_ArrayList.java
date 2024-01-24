package Lesson.L10_Collection.List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Arrays.asList(DataType []) -->List<DataType>
// removeAll(Collection <?> c) --->boolean
// retainAll(Collection <?> c) --->boolean (antonim removeAll)
// containsAll(Collection <?> c) --->boolean
// subList(int fromIndex, int toIndex) --->List<E>
// List.of(E elements) --->List<E>    (изменить НЕЛЬЗЯ)
// List.copyOf(Collection <E> c) --->List<E>   (изменить НЕЛЬЗЯ)
// roArray()-->Object []

public class Method_ArrayList {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("A");
        StringBuilder sb2=new StringBuilder("B");
        StringBuilder sb3=new StringBuilder("C");
        StringBuilder sb4=new StringBuilder("D");
// asList
        StringBuilder[] array={sb1,sb2,sb3,sb4};
        List<StringBuilder>sbList= Arrays.asList(array);
        System.out.println("asList="+sbList);
        array[0].append("!!!");
        System.out.println("asList="+sbList);
        System.out.println("-------------------");

// removeAll
        ArrayList <String> all=new ArrayList<>();
        all.add("one");
        all.add("two");
        all.add("two");
        all.add("three");
        all.add("four");
        all.add("five");
        ArrayList <String> retAll=(ArrayList<String>) all.clone();
        System.out.print("all=" + all);

        ArrayList <String> list=new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("ten");
        System.out.println("   |||   list=" + list);

        all.removeAll(list);
        System.out.println("all.removeAll(list)=" + all);
        System.out.println("-------------------");
//retainAll
        System.out.println("retAll=" + retAll + "    |||    list="+list);
        retAll.retainAll(list);
        System.out.println("retAll.retainAll(list)="+retAll);
        System.out.println("-------------------");
//containsAll
        System.out.println("cont=" + retAll + "    |||    list="+list);
        boolean result=retAll.containsAll(list);
        System.out.println("cont.containsAll(list);="+result+"\n");

        list.remove("ten");
        System.out.println("cont5=" + retAll + "    |||    list="+list);
        System.out.println("cont5.containsAll(list)="+retAll.containsAll(list));
        System.out.println("-------------------");
//subList
        /*List<String> subList=*/
        all.add(0,"three");
        all.add(0, "two");
        all.add(0, "one");
        System.out.println("all="+all);
        List<String> subList=all.subList(1,4);
        System.out.println("subList = "+subList);
        subList.add("ten");
        System.out.println("all="+all+"   ||     ten     ||   subList="+subList);
        all.add(2,"twenty");
        // (Exception) subList не может принять значение "twenty" через "all"
        // добавление мы должны выполнять через subList
        // System.out.println("all="+all+"   || twenty ||   subList="+subList);
        System.out.println("-------------------");
// List.of
        List <String> listOf=List.of("odin", "dva", "tri");
        /*listOf.add("dsd");*/
        System.out.println("listOf="+listOf);
        System.out.println("-------------------");
// List.copyOf
        List <String> listCopy=List.copyOf(listOf);
        System.out.println("ListCopy="+listCopy);
        System.out.println("-------------------");
// toArray()
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        Object [] objectArray=arrayList.toArray();
        String [] stringArray=arrayList.toArray(new String [0]);
        for (String s:stringArray){
            System.out.print(s+" ");
        }
    }
}
