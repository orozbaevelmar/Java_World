package Lesson.L16_Abstract_Interface;
public abstract class Animal {
    String name;
    Animal(String name){
        this.name=name;
    }
    abstract void eat();
    abstract void sleep();
}
abstract class Fish extends Animal{
    Fish(String name){
        super(name);
        this.name=name;
    }
   void sleep(){
        System.out.println("Ryba spit");
    }
    abstract void swim();
}
abstract class Bird extends Animal implements SpeakAble{
    Bird(String name){
        super(name);
        this.name=name;
    }
    abstract void fly();

    public void speak(){
        System.out.println(name+" sings");
    }
}
abstract class Mammal extends Animal implements SpeakAble{
    Mammal(String name){
        super(name);
        this.name=name;
    }
    abstract void run();
}
interface SpeakAble{
    default void speak(){
        System.out.println("Somebody speaks");
    }
}
class Meshenosec extends Fish{
    Meshenosec(String name){
        super(name);
        this.name=name;
    }
    public void swim(){
        System.out.println("Meshenosek krasivaya riba");
    }
    public void eat(){
        System.out.println("Он быстро всех съест");
    }
}
class Pingvin extends Bird{
    Pingvin(String name){
        super(name);
        this.name=name;
    }
    void eat(){
        System.out.println("Pingvin lyubit est ribu");
    }
    void sleep(){
        System.out.println("Pingviny lyubat spat");
    }
    void fly(){
        System.out.println("Pingviny ne umeyut letat");
    }
    public void speak(){
        System.out.println("Pingviny ne umeyut pet kak solovyi");
    }
}
class Lev extends Mammal{
    Lev(String name){
        super(name);
        this.name=name;
    }
    void eat(){
        System.out.println("Lev kak i lyuboi hishnik lyubit myaso");
    }
    void sleep(){
        System.out.println("Bolshuyu chast dnya lev spit");
    }
    void run(){
        System.out.println("Lev-eto ne samaya bystraya koshka");
    }
}

class Test{
    public static void main(String[] args) {
        Meshenosec m=new Meshenosec("mesh");
        System.out.println(m.name);
        m.swim();
        m.eat();
        m.sleep();


        System.out.println();
        SpeakAble a=new Pingvin("Everest");
        a.speak();

        System.out.println();
        Lev lev=new Lev("Alfa");
        System.out.println(lev.name);
        lev.eat();
        lev.sleep();
        lev.speak();
        lev.run();
    }
}