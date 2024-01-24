package Lesson.L18_equals_hashcode_toString_Initializer;

// Равнозначные initializer блоки выполняются в той последовательности, в которой они описаны в классе
// 1.Статические блоки и переменные родительского класса
// 2.Статические блоки и переменые дочернего класса

// 3.НЕ статические блоки и переменные родительского класса
// 4.Конструктор родительского класса
// 5.Не статические блоки и переменные дочернего класса
// 6.Конструктор дочернего класса
// Инициализация пунктов 3-6пунктов происходит толко и при каждом создании блока:

public class Initializer_Sequence {
    public static void main(String[] args) {
        Lion l=new Lion();

    }
}
class Animal{
    Animal(){System.out.println("Constructor of animal");}
    static{System.out.println("Static init in Animal");}
    {System.out.println("Non-static init in Animal");}
}
class Mammal extends Animal{
    Mammal(){System.out.println("Constructor of Mammal");}
    static{System.out.println("Static init in Mammal");}
    {System.out.println("Non-static init in Mammal");}
}
class Lion extends Mammal{
    Lion(){System.out.println("Constructor of Lion");}
    static{System.out.println("Static init in Lion");}
    {System.out.println("Non-static init in Lion");}
}
