package Lesson.L15_Overriding_Hiding_Final;

// Overriding-перезаписанный
// Это изменение non-static, non-final метода в sub классе, который он унаследовал от parent класса
// Методы считаются overriden если:
// Имя в sub классе такое же, что и parent классе  eat(), eat(); [(не eat2();]
// Список аргументов в sub классе такой же, что и parent классе [не то overloaded{int,double}----eat(int a),  eat(int d)]
// Return type в SUB классе такой же, что и PARENT классе или же RETURN TYPE в SUB классе - это SUB класс RETURN TYPE из PARENT класса (covariant return types) int eat(){}
    // для Reference можно вернуть child класс, А если примитивный тип данных то только само тип данных вернуть нужно (WRONG int eat(){return 0;чё}---byte eat(){return 0;}
// Access modifier в sub классе такой же или менее строгий, чем в parent классе PUBLIC->PROTECTED->DEFAULT->PRIVATE
// Метод в sub классе тоже должен быть non-static

// Вы можете использовать ANNOTATION (@Override), когда перезаписываете метод

public class Overriding {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Dog dog=new Dog();

        animal.eat();
        dog.eat();
        System.out.println();

        animal.sleep();
        dog.sleep();
        System.out.println();

        animal.springen(3);
        dog.springen(3);
        System.out.println();

    }
}
class Animal{
    void eat(){
        System.out.println("Speise essen");
    }
// Имя в sub классе такое же, что и parent классе  eat(), eat(); [(не eat2();]
    void sleep(){
        System.out.println("Gut geschlafen?");
    }
// Список аргументов в sub классе такой же, что и parent классе [не то --> overloaded{int,double}---->override eat(int a),  eat(int d)]
    void springen(int a){
        System.out.println("Gut springen");
    }
// Return type в SUB классе такой же, что и PARENT классе или же RETURN TYPE в SUB классе - это SUB класс RETURN TYPE из PARENT класса (covariant return types) int eat(){}
    Speise essen(){
        System.out.println("Speise essen");
        Speise speise=new Speise();
        return speise;
    }
    // не Byte, не Long
    int zahlen(){
        System.out.println("bis 10");
        return 0;
    }
// Access modifier в sub классе такой же или менее строгий, чем в parent классе PUBLIC->PROTECTED->DEFAULT->PRIVATE
    protected Speise stop(){
        System.out.println("Speise stop");
        Speise speise=new Speise();
        return speise;
    }
}

class Dog extends Animal{
    @Override
    void eat() {   //перезаписанный-OVERRIDING
        System.out.println("Nicht essen");
    }
// Имя в sub классе такое же, что и parent классе  eat(), eat(); [(не eat2();]
    void sleep1(){
        System.out.println("Nicht schlafen");
    }
// Список аргументов в sub классе такой же, что и parent классе [не то overloaded{int,double}----eat(int a),  eat(int d)]
    void springen(int d){
        System.out.println("Schlecht springen");
    }
// Return type в SUB классе такой же, что и PARENT классе или же RETURN TYPE в SUB классе - это SUB класс RETURN TYPE из PARENT класса (covariant return types) int eat(){}
    Obst essen(){
        System.out.println("Das Obst essen");
        Obst obst=new Obst();
        return obst;
    }
    //не Byte, не Long
    int zahlen(){
        System.out.println("bis 20");
        return  0;
    }
// Access modifier в sub классе такой же или менее строгий, чем в parent классе PUBLIC->PROTECTED->DEFAULT->PRIVATE
    protected Speise stop() { //нельзя DEFAULT-PRIVATE
        System.out.println("Speise stop");
        Obst obst = new Obst();
        return obst;
    }
}

class Speise{}
class Obst extends Speise{}

