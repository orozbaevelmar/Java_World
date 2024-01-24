package Lesson.L17_Polymorphism_Instanceof_Casting;

public class Test_Instanceof {
    public static void main(String[] args) {
        Animal5 a1=new Meshenosec5("Meshenosek animal");
        Animal5 a2=new Pingvin5("Pingvin animal");
        Animal5 a3=new Lev5("Lev animal");

        Fish5 fish1=new Meshenosec5("Meshenosek fish");

        Bird5 bird1=new Pingvin5("Pingvin bird");

        Mammal5 mammal1=new Lev5("Mammal lev");

        Meshenosec5 meshenosec1=new Meshenosec5("Meshenosec meshenosec");

        Pingvin5 pingvin=new Pingvin5("Pingvin pingvin");

        Lev5 lev=new Lev5("Lev lev");

        SpeakAble5 able1=new Lev5("Speakable Lev");
        SpeakAble5 able2=new Pingvin5("Speakable Pingvin");

        Animal5[] array1={a1,a2,a3,fish1,bird1,mammal1,meshenosec1,pingvin,lev};
        SpeakAble5[] array2={able1,able2,bird1,mammal1,pingvin,lev};

        for (Animal5 anim:array1){
            if (anim instanceof Meshenosec5){
                System.out.println(anim.name);
                anim.eat();
                anim.sleep();
                ((Meshenosec5)anim).swim();
                System.out.println();
            }
            else if (anim instanceof Pingvin5){
                Pingvin5 p=(Pingvin5)anim;
                System.out.println(p.name);
                p.sleep();
                p.fly();
                p.eat();
                p.speak();
                System.out.println();
            }
            else if (anim instanceof Lev5){
                System.out.println(anim.name);
                ((Lev5)anim).speak();
                anim.eat();
                anim.sleep();
                ((Lev5)anim).run();
                System.out.println();
            }
        }

        for (SpeakAble5 spable:array2){
            if (spable instanceof Meshenosec5){
                Meshenosec5 m=(Meshenosec5)spable;
                System.out.println(m.name+"   MEN APPPPPPP");
                m.sleep();
                m.eat();
                m.swim();
                spable.speak();
                System.out.println();
            }
            if (spable instanceof Pingvin5){
                System.out.println(((Pingvin5)spable).name);
                ((Pingvin5)spable).eat();
                ((Pingvin5)spable).fly();
                spable.speak();
                ((Pingvin5) spable).sleep();
                System.out.println();
            }
            else if(spable instanceof Lev5){
                Lev5 l=(Lev5)spable;
                System.out.println(l.name);
                l.eat();
                l.run();
                l.sleep();
                l.speak();
                System.out.println();
            }

        }

    }
}

abstract class Animal5 {
    String name;
    Animal5(String name){
        this.name=name;
    }
    abstract void eat();
    abstract void sleep();
}
abstract class Fish5 extends Animal5 {
    Fish5(String name){
        super(name);
        this.name=name;
    }
    void sleep(){
        System.out.println("Ryba spit");
    }
    abstract void swim();
}
abstract class Bird5 extends Animal5 implements SpeakAble5 {
    Bird5(String name){
        super(name);
        this.name=name;
    }
    abstract void fly();

    public void speak(){
        System.out.println(name+" sings");
    }
}
abstract class Mammal5 extends Animal5 implements SpeakAble5 {
    Mammal5(String name){
        super(name);
        this.name=name;
    }
    abstract void run();
}
interface SpeakAble5 {
    default void speak(){
        System.out.println("Somebody speaks");
    }
}
class Meshenosec5 extends Fish5 {
    Meshenosec5(String name){
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
class Pingvin5 extends Bird5 {
    Pingvin5(String name){
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
class Lev5 extends Mammal5 {
    Lev5(String name){
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


