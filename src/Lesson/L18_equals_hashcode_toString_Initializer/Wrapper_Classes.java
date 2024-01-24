package Lesson.L18_equals_hashcode_toString_Initializer;

// 1.byte-Byte    short-Short     int-Integer     long-Long   float-Float     double-Double   char-Char   boolean-Boolean
// 2.Autoboxing-это конвертирование примитивных типов данных в соответствующий wrapper class
// 3.Unboxing-это конвертирование объекта типа Wrapper класс в соответствующий примитивный тип данных
// 4.Метод Parse позволяет нам конвертировать подходящее значение типа данных String в соответствующий примитивный тип данных
// 5.Метод ValueOf позволяет нам создавать новый объект wrapper класса того типа, на котором данный метод был вызван.

import java.util.ArrayList;
import java.util.List;

public class Wrapper_Classes {
    public static void main(String[] args) {
// Autoboxing
        List<Integer> list=new ArrayList<>();
        list.add(5); // 5 это int перевели в Integer
// Unboxing
        int a=list.get(0);
        System.out.println(a);
        Number i1=new Integer(10);
        int i2=(int)i1;
        System.out.println(i2);
// Parse
        String s1="12";
        int san=Integer.parseInt(s1);
        String s2="true";
        String s3="truee";
        boolean bool1=Boolean.parseBoolean(s2);
        Boolean bool2=Boolean.parseBoolean(s3);
        System.out.println(bool1+"   "+bool2);
// 5.ValueOf
        Integer f1=Integer.valueOf(s1);
        String s5="3.14";
        Double d=Double.valueOf(s5);
        System.out.println(d);

        String h="2";
        Byte b=new Byte((byte)10);
        Byte b1=Byte.valueOf((byte) 23);
        Byte b2=Byte.valueOf(h);
        System.out.println(b1+"  "+b2);
    }
}
