package Lesson.L4_return_void;

public class Person_2 {
    Person_2() {}  // ќн есть но его не видно, можно и удалить

    public static void main(String[] args) {
        Person1 maks=new Person1();
        maks.height=170;
        maks.weight=70.1F;
        maks.say("Hi, I'm  Maks");
        System.out.println(maks.height);

        Person1 oleg=new Person1();
        oleg.height=180;
        oleg.weight=90.3F;
        System.out.println(oleg.weight);


    }
}
