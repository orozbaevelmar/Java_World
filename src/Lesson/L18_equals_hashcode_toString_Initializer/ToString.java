package Lesson.L18_equals_hashcode_toString_Initializer;

// Метод toString принадлежит классу Object, возвращает строковое представление объекта. Дефолтная реализация данного
//                  метода возвращает имя класса, @, число(результат метода hashcode данного объекта).

public class ToString {
    public static void main(String[] args) {
        Gebaude g1=new Gebaude("Red", 3);
        Gebaude g2=new Gebaude("black", 5);
        System.out.println(g1);
    }
}
class Gebaude{
    Gebaude(String color, int tur){
        this.color=color;
        this.tur=tur;
    }
    String color;
    int tur;
    public String toString(){
        return "Svet mashiny:"+color+" i dverei:"+tur;
    }
}