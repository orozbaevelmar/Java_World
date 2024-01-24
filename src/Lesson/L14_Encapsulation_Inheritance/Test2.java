package Lesson.L14_Encapsulation_Inheritance;
///////////////////////////////////////////////
class Animal{
}
class Mouse extends Animal{}

///////////////////////////////////////////////
public class Test2 {
    public Animal abc(){
        return new Mouse();
    } //Because Mouse is Animal
}

///////////////////////////////////////////////
class Test3{
    public Object def(){
        return new int[]{2,6,9,3};
    }  // Because array is Object
}
