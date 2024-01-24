package Lesson.L26_Nested_Classes;

// Вложенные классы

// L26_Nested_Classes---->top level
// static class A----->static nested class
// class B{}---->Inner class
// class C{}---->Locale class
//          ----->Anonymous class

// 1.Внутри внешнего класса можно создать nested class. () мы используем тогда, когда нам какой-то класс нужно тесно привязать
//   к другому(к внещнему), без которого он чаще всего никому не нужен, и нигде не используеться.
// 2.Внутренний класс ведет себя как обычный класс за тем исключением, что его объекты могут быть созданы только внутри внешнего класса.
// 3.Внутренний класс имеет доступ ко всем полям внешнего класса, в том числе закрытым с помощью модификатора private. Аналогично внешний
//   класс имеет доступ ко всем членам внутреннего класса, в том числе к полям и методам с модификатором private.
// 4.Ссылку на объект внешнего класса из внутреннего класса можно получить с помощью выражения Внешний_класс.this, например, Person.this.
// 5.Статические вложенные классы-кроме внутренних классов также могут быть статические вложенные классы. Статические вложенные классы
//   позволяют скрыть некоторую комплексную информацию внутри внешнего класса:
// 6.Еще одной особенностью внутренних классов является то, что их можно объявить внутри любого контекста, в том числе внутри метода и даже в цикле:
public class NestedClassEx1 {

    static class A{ }

    class B{}

    void method1(){
        class C{}
    }
}