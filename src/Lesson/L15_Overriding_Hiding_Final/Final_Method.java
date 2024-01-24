package Lesson.L15_Overriding_Hiding_Final;

// FINAL метод-это метод который не может быть OVERRIDEN или HIDDEN (В SUB классе можно ичпользовать но нельзя OVERRIDEN или HIDDEN)
// FINAL класс-это класс, который не может иметь потомков

public class Final_Method {

}
class Flower{
    final public void ArtDerBlumen(){
        System.out.println("Weiss");
    }

     final public static void sleep(){
        System.out.println("Flower spit");
    }
}
class Roza extends Flower{
// Использовать можно, но НЕЛЬЗЯ перезаписывать!
    /*public void ArtDerBlumen(){
        System.out.println("Rot");
    }*/

//Нельзя HIDE
    /*static void sleep(){
        System.out.println("Roza spit");
    }*/

public static void main(String[] args) {
    Roza r=new Roza();
    r.ArtDerBlumen();

    Flower.sleep();
    r.sleep();
}
}

// FINAL класс-это класс, который не может иметь потомков
final class P{ }
// Нельзя Удочерить
/*class T extends P{ }*/
