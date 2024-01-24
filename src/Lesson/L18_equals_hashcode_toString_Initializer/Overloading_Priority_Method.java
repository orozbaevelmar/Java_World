package Lesson.L18_equals_hashcode_toString_Initializer;

// 1.int-->2.Llong-->3.byte
// когда значение String 1.String-->2.Object

// Если при вызове метода его параметр лист соответствует нескольким параметр листам overloaded методов,
//                                          то приоритет их вызова выглядет следущим образом:
// 1.Точное совпадение типов данных
// 2.Поглащающие типы данных(большие типы данных для Primitive и Parent классы для reference типов);
// 3.Autoboxed типы данных

// 10.Конвертация типов данных для соответствия параметр листу метода не может происходить в 2 этапа (Wrong int-->long-->Long)(int->Integer(super.Object)

public class Overloading_Priority_Method {
    /*void abc(int i){System.out.println("int");}*/
    void abc(byte b){System.out.println("byte");}
    void abc(long l){System.out.println("long");}

    void def(Object o){System.out.println("Object");}
    /*void def(String s){System.out.println("String");}*/

/*1*/    void ghi(int i, int i2){        System.out.println("Hello 1");}
/*2*/    void ghi(long l1,long l2){      System.out.println("Hello 2");}
/*3*/    void ghi(Integer h1,Integer h2){System.out.println("Hello 3");}
/*4*/    void ghi(int ... a) {           System.out.println("Hello 4");}

    public static void main(String[] args) {
        Overloading_Priority_Method o=new Overloading_Priority_Method();
        o.abc(43);
        System.out.println();
        o.def("hello");
        o.def(new StringBuilder("String builder"));

        o.ghi(4,6);

        Test.xyz("HELLO");

        Test.prs(312L);// В конце L мы должны написать

        Test.asd(50);
    }
}
class Test{
    /*static void xyz(String s1){System.out.println("A-1");}*/
    static void xyz(Object o){System.out.println("B-2");}
    static void xyz(String ... varargs){System.out.println("C-3");}
    static void xyz(String s2,String s3){System.out.println("D");}

    static void prs(Long a){System.out.println("P-1");}
    static void prs(Long ... longs){System.out.println("R-2");}

// 10.
    static void asd(long a){System.out.println("P-1");}
    static void asd(Integer a){System.out.println("R-2");}
    static void asd(Object a){System.out.println("S-3");}
    static void asd(Long a){System.out.println("0-0");}
    static void asd(Long ... a){System.out.println("0-0");}

}
