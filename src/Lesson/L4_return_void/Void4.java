package Lesson.L4_return_void;

public class Void4 {
    public static void main(String[] args) {
        Human h=new Human();
        h.name="Manas";
        h.car=new Car3("black", "V5");
        h.ba=new BankAccount(7, 255.7);
        h.info();
    }
}
class Human{
    String name;
    Car3 car;
    BankAccount ba;

    void info(){
        System.out.println("Iмя="+name+"  Цвет машины="+car.color+"   Баланс банковского счета="+ ba.balance);
    }
}
class Car3{
    Car3(String c, String e){
        color=c;
        engine=e;
    }
    String color;
    String engine;
}
class BankAccount{
    int id;
    double balance;
    BankAccount(int id2, double balance2){
        id=id2;
        balance=balance2;
    }
}
