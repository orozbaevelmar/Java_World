package Lesson.L12_Method_CallUp;

import Lesson.L5_Overloading.OverloadingMit_Void;
import Lesson.L4_return_void.Person1;

public class PackageCallUp {
    public static void main(String[] args) {
        Person1 abc=new Person1();
        abc.say("Ich habe von package Person1 gekommt");

        OverloadingMit_Void ovld=new OverloadingMit_Void();
        ovld.show(500); //Ставим Public перед ПАРАМЕТРОМ, тогда можно его вызвать!!!
    }
}
