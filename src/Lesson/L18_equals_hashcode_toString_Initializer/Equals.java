package Lesson.L18_equals_hashcode_toString_Initializer;

import java.util.ArrayList;
import java.util.List;

// Если вы перерзаписываете метод Equals, всегда используйте в его параметре тип данных Object.
// Правильно и логично перезаписанный метод Equals должен обладать следующими свойствами:
//   1.Симметричность-для non-null ссылочных переменных a и b a.equals(b) возвращает True тогда, когда b.equals(a) возвращает True
//   2.Рефлективность-для non-null ссылочной переменной a, a.equals(a) всегда должно возвращать True
//   3.Транзитивность- для non-null ссылочных переменных a,b и c, если a.equals(b) и b.equals(c) возвращает True, то a.equals(c) True
//   4.Постоянство-для non-null сылочных переменных a и b, неодракратный вызов a.equals(b) должен возвращать или только True, или только False;
//   5.Для non-null ссылочной переменной a, a.equals(null) всегда должно возвращать False;

// Метод Equals и Contains похожи, если Оверрайдить Equals значение Contains тоже измениться
public class Equals{
    public static void main(String[] args) {
        Car c1=new Car("black", "V4");
        Car c2=new Car("black", "V4");
        Car c3=new Car("red", "V8");
        System.out.println(c1==c2);
        System.out.println();

        System.out.println("Overrided Equals = "+c1.equals(c2));
        System.out.println("Overrided Equals = "+c1.equals(c3));
        System.out.println();
        System.out.println("Super Equals = "+c1.superEquals(c1));
        System.out.println("Super Equals = "+c1.superEquals(c2));
        System.out.println("Super Equals = "+c1.superEquals(c3));

        List<Car>list=new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        Car c4=new Car("red", "V8");
        System.out.println("list = "+list.contains(c4));
        System.out.println();
        System.out.println(c1.equals(null));
        c2=null;
        /*System.out.println(c2.equals(c1));     Wrong    */
    }
}
class Car{
    String color;
    String engine;
    Car(String color, String engine){
        this.color=color;
        this.engine=engine;
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof  Car){
            Car c2=(Car)obj;
            return color.equals(((Car)obj).color) && engine.equals(((Car)obj).engine);
        }
        else return false;
    }
    public boolean superEquals(Object obj){
        return super.equals(obj);
    }
}