package Lesson.L19_Exceptions;

// Сабклассы RuntimeException = unchecked exceptions
// Runtime исключение бывает в коде, в котором присутствуют ошибочные выражения. Т.е. в выбросе данных исключений виноват программист.
//                   Компилятор НЕ в состоянии проверить возможность выброса Runtime исключений
// Runtime исклюячения можно не обявлять и не обрабатывать, но при желании можно сделать и то, и другое

// RuntimeException subKlass 1)ArrayIndexOutOfBoundsException 2)IndexOutOfBoundsException 3)ArithmeticException 4)ClassCastException
//                           5)IllegalArgumentException 6)IllegalStateException 7)NullPointerException 5-8)NumberFormatException

import java.util.*;

public class Runtime_Exception_SubKlass {
    static ArrayList<String> list1;
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
// -2-
        /*System.out.println(list.get(3));*/
// -3-
        /*System.out.println(5/0);*/
// -4-
        /*Doctor d=new Doctor();
        Teacher t=new Teacher();
        Employee [] array1={d,t};
        Teacher t2=(Teacher) array1[0];*/
// -5-
        createPwd("qwertb");
        System.out.println();
// -6-
        /*Samolet s=new Samolet();
        s.ojidat();
        s.letet();
        s.otmenitPolet();*/
// -7-
        /*ArrayList<String> list2 = null;
        list2.add("!!!");
        list1.add("!!!");*/
// -8-
        Integer.parseInt("44ab", 16); //OK
        Integer.parseInt("44ab");          //Wrong
    }
    public static void createPwd(String pwd){
        if (pwd.length()<6){
            throw new IllegalArgumentException("Dlina parolya slishkom malenkaya");
        }
        if (pwd.length()>12){
            throw new IllegalArgumentException("Dlina parolya slishkom bolshaya");
        }
        System.out.println("Parol uspeshna");
    }
}
class Employee{ }
class Doctor extends Employee{ }
class Teacher extends Employee{ }

class Samolet{
    String sostoyania="v ojidanii"; // v ojidanii, v vozduhe, polet otmenen
    public void letet(){
        sostoyania="v vozduhe";
        System.out.println("Samolet letit");
    }
    public void ojidat() {
        if (sostoyania.equals("v vozduhe")) throw new IllegalArgumentException("Samolet uje v vozduhe");
        sostoyania="v ojidanii";
        System.out.println("Samolet v ojidanii poleta");
    }
    public void otmenitPolet(){
        if (sostoyania.equals("v vozduhe")) throw new IllegalStateException("Samolet v vozduhe");
        sostoyania="v ojidanii";
        System.out.println("Polet samoleta otmenen");
    }
}