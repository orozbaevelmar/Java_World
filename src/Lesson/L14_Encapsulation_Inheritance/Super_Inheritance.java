package Lesson.L14_Encapsulation_Inheritance;

// Выражение SUPER вызывает конструктор SUPER класса, который заканчивает свою работу всегда раньше конструктора CHILD класса
// Выражение SUPER если есть, то должно стоять на 1-ой строке конструктора
// Если мы не напишем выражение SUPER, то компилятор дописывает его сам, обращаясь к конструктору без параметров SUPER класса
// Выражение SUPER и THIS не могут одновременно находиться в теле конструктора

// С помошью Keyword "Super" можно обращаться как к методам, так и к переменным родительского класса.
// Невозможно использование Keyword "SUPER" в Static методах и переменных
// Для того чтобы обратиться к элементам родительского класса с помошью Keyword "Super", эти элементы должны быть видны в дочернем клсаае (НЕ private)
// При обращении к методу родителького класса, выражение SUPER не обьязательно должно быть первой строкой тело метода

class   Human2{
    String name;
    String surname;
    Human2(String n){ //        (3)
        this(n, null);
    }
    Human2(String n, String s){ //  (4)
        name=n;
        surname=s;
    }
}

public class Super_Inheritance extends Human2 {

    Super_Inheritance() { //        (1)
        this(5);
        System.out.println("Hello");
    }
    Super_Inheritance(int i){ //      (2)
        super("Petya");
    }

    public static void main(String[] args) {
        Super_Inheritance ab=new Super_Inheritance();
    }
}

class Student{
    String name;
    String surname;
    Student(String name, String surname){
        this.name=name;
        this.surname=surname;
    }
}
class Pupil extends Student{
    int course;
    Pupil(String name, String surname, int course){
        super(name, surname);
        this.course=course;
    }

    public static void main(String[] args) {
        Pupil p=new Pupil("Bek", "Bekov",  3);
        System.out.println(p.name+" "+p.surname+" "+p.course);
    }
}

