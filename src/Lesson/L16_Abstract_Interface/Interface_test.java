package Lesson.L16_Abstract_Interface;

public class Interface_test implements L1,L2 {
// Overloaded
    public void abc(int a){
        System.out.println("Zahl = "+a);
    }
    public void abc(String s){
        System.out.println("Mein name "+s);
    }
}
interface L1{
    void abc(int a);
}
interface L2{
    void abc(String s);
}
