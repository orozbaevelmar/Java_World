package Lesson.L16_Abstract_Interface;

// Figura-не конкретное(not Object), а абстрактное
// У ABSTRACT Методов не бывает тело тоесть{}
// Невозможно создать объект abstract класса
// Если в классе есть abstract метод, то этот класс тоже должен быть abstract
// abstract класс может содержать, а может и не содержать abstract методы
// Дочерний класс должен перезаписать все abstract методы родительского класса или тоже быть abstract

// Можно использовать reference variable типа abstract класса чтобы ссылаться на обьект дочернего класса, который не является abstract
// Abstract класс не может быть final
// Переменные не могут быть abstract
// У abstract классов есть конструктор
// Любой перезаписанный метод может быть как abstract, так и не abstract
// Для методов недопустимо сочетание: final abstract, private abstract, static abstract

public class Abstract_klass_method {
// WRONG
    /*public static void main(String[] args) {
        Figura f=new Figura();}*/
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolichestvoStoron);
        f1.ploshad();
    }
}
abstract class Figura {
////У abstract классов есть конструктор
   /* Figura(int kolichestvoStoron){
        this.kolichestvoStoron=kolichestvoStoron;
    }*/
    int kolichestvoStoron;
    abstract void perimetr();
    void ghi(){}
    abstract void ploshad();
    void showInfo(){System.out.println("Eto figura");}
}
class Kvadrat extends Figura{
//// У abstract классов есть конструктор
    /*Kvadrat(int kolichestvoStoron){
        super(kolichestvoStoron);
        this.kolichestvoStoron=kolichestvoStoron;
    }*/
    int storona1=10;

    int kolichestvoStoron=4;
    public void perimetr(){
        System.out.println("Perimetr kvadrata = "+4*storona1);
    }
    public void ploshad(){
        System.out.println("Ploschad kvadrata = "+storona1*storona1);
    }
}
class Pryamaugolnik extends Figura{
    int storona1=9;
    int storona2=5;

    int kolichestvoStoron=4;
    public void perimetr(){
        System.out.println("Perimetr pryamaugolnik = "+2*storona1+2*storona2);
    }
    public void ploshad(){
        System.out.println("Ploschad pryamaugolnik = "+storona1*storona2);
    }
}
class Okrujnost extends Figura{
    int kolichestvoStoron=0;

    int radius=3;
    public void perimetr(){
        System.out.println("Perimetr pryamaugolnik = "+2*3.14+radius    );
    }
    public void ploshad(){
        System.out.println("Ploschad pryamaugolnik = "+3.14*radius*radius);
    }
}

abstract class Chetyrechugolnik extends Figura{
//// Любой перезаписанный метод может быть как abstract, так и не abstract
    abstract void ploshad();
    void def(){
        System.out.println("Eto chetyrechugolnik");
    }
}