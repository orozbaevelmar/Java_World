package Lesson.L9_Constructor;

public class Construktor_user_defined {
    Construktor_user_defined(String svet, String motor /*(Mit Parametr)*/ ){
        color=svet;
        engine=motor;
    }
    String color;
    String engine;
}
class Tesla{
    Tesla(){
        System.out.println();
        System.out.println("(class Tesla)  "+"Object is created!!!");
    }
}
class CarOhneParametr {
    CarOhneParametr(){
        streng="PferdKraft";
        mude="EinBisschen";
    }
    String streng;
    String mude;
}
class CarTest{
    public static void main(String[] args) {
        Construktor_user_defined car1=new Construktor_user_defined("yellow","V4");
        System.out.print("(car1.color)="+car1.color);
        System.out.println("   (car1.engine)="+car1.engine);

        Tesla t=new Tesla();

        System.out.println();
        CarOhneParametr car5=new CarOhneParametr();
        System.out.println("(class Car5)  "+car5.streng+"  "+car5.mude);
        CarOhneParametr car6=new CarOhneParametr();
        car6.streng="NurPferd";
        car6.mude="viele";
        System.out.println("(class Car6)  "+car6.streng+"  "+car6.mude);
    }
}
/*class Car8{
    Car8(){

    }
    String mannlich;
    String weiblich
}*/
