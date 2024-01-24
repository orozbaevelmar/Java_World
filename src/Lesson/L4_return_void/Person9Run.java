package Lesson.L4_return_void;

import Lesson.L4_return_void.Person8;

public class Person9Run {
    public static void main(String[] args) {
        Person8 aktan = new Person8(180, 78.4F);

        aktan.say("Hi, I'm  Aktan");
        System.out.println(aktan.height);

        Person8 akylai = new Person8();
        akylai.height = 180;
        akylai.weight = 90.3F;
        System.out.println(akylai.weight);
    }
}
