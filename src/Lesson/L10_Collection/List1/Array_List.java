package Lesson.L10_Collection.List1;

import java.util.*;

// В основе ArrayList лежит массив Object

// ArrayList arrayList1=new ArrayList();
// ArrayList <DataTypes> arrayList2=new ArrayList<>();
// ArrayList <DataTypes> arrayList3=new ArrayList<>(30);
// ArrayList <DataTypes> arrayList4=new ArrayList<>(arrayList3);
// ArrayList arrayList5=new ArrayList();

// add(DataType element);       add(index, DataType element);-->boolean
// addAll(ArrayList aL);    addAll(int index, ArrayList aL)-->boolean
// get(int index)-->DataType
// set(int index, DataType element)-->DataType
// size();-->int
// remove(Object element)->boolean     remove(int index)->DataType
// clear()----void
// indexOf(Object element)-->int
// lastIndexOf(Object element)-->int
// isEmpty()-->boolean
// contains(Object element)-->boolean
// clone()-->Object
// toArray()-->Object []
// toArray(DataType [] array)--->DataType[]
// Arrays.asList()---->mass to list
// Collections.sort(ArrayList <DataType>)
// equals(ArrayList<DataType>)--->boolean (Warning!!!-порядок(order) и elements имеет значение
// toString()-->String

// forEach
// Iterators

public class Array_List {
    public static void main(String[] args) {
        ArrayList arrayList8=new ArrayList();
        Car c=new Car();
        arrayList8.add(c);
        arrayList8.add(new StringBuilder("ok"));
        arrayList8.add("hello");
        arrayList8.add("hello");
        System.out.println(arrayList8+"<---arrayList8");

// indexOf();  lastIndexOf
        System.out.println(arrayList8.indexOf("hello")+"<---IndexOf");
        System.out.println(arrayList8.lastIndexOf("hello")+"<---lastIndexOf");


        ArrayList <String> arrListString=new ArrayList<>(5);
        arrListString.add(0,"privet");
        arrListString.add("poka");
        arrListString.add(0,"ok");
        System.out.print("\nlistSting--->");
        for (String str:arrListString){
            System.out.print(str+" ");
        }System.out.println("\n");
// Iterator---remove
        /*List*/Iterator<String> iter=arrListString./*list*/iterator();
        while (iter.hasNext()){
            System.out.print(iter.next()+" ");
            iter.remove();
        }System.out.println("<---Itertator");
        System.out.println(arrListString.isEmpty()+"\n");

        ArrayList <String> arrListStr=new ArrayList<>();
        arrListStr.add("ich");
        arrListStr.add("bin");
        arrListStr.add("Bek");
//addAll()
        arrListString.addAll(arrListStr);
// get; set; isEmpty; contains();
        System.out.println(arrListStr.get(0));
        arrListStr.set(0, "Du");
        System.out.println(arrListStr.get(0));
        System.out.println(arrListStr.isEmpty()+"<---isEmpty()");
        System.out.println(arrListStr.contains("Bek")+"<---contains()");
//clone()
        ArrayList <String> listClone=(ArrayList<String>)arrListStr.clone();
        System.out.println(listClone);
// toArray()--->Object[]
        System.out.println();
        Object[] listArr=arrListStr.toArray();
        for (Object o:listArr){
            System.out.println(o);}
// toArray(DataType [] array)--->DataType[]
        System.out.println();
        String [] arrString=arrListStr.toArray(new String[arrListStr.size()+1]);
        for (String str:arrString){
            System.out.println(str);
        }
        arrString[3]="abc";
// asList()
        System.out.println();
        List<String> list=Arrays.asList(arrString);
        System.out.println(list+"\n");
//Collections.sort(arrList)
        ArrayList <String> arrli=new ArrayList<>();
        arrli.add("AA");
        arrli.add("BA");
        arrli.add("AC");
        System.out.println(arrli);
        Collections.sort(arrli);
        System.out.println(arrli);
// equals(arrList)
        System.out.println(arrListStr==arrListString);
    }
}
class Car{}
