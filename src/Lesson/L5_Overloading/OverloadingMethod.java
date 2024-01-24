package Lesson.L5_Overloading;

public class OverloadingMethod {

    // Разный по типам
    void showTip(int a, String b){
        System.out.println(a+" "+b);
    }
    void showTip(double a, String b){
        System.out.println(a+" "+b);
    }

    // Разный по количеству
    void showKolichestvo(int a, int b){
        System.out.println(a+" "+b);
    }
    void showKolichestvo(int a, int b, int c){
        System.out.println(a+" "+b+" "+c);
    }

    // Разный по порядку
    void showPoryadok(int a, String b){
        System.out.println(a+" "+b);
    }
    void showPoryadok(String b, int a){
        System.out.println(b+" "+a);
    }
}
class Test{
    public static void main(String[] args) {
        OverloadingMethod mo = new OverloadingMethod();

        mo.showTip(500, "Super");
        mo.showTip(25.0, "Cool");

        mo.showKolichestvo(1, 2);
        mo.showKolichestvo(1, 2,3);

        mo.showPoryadok(7, "Men");
        mo.showPoryadok("Boy", 3);
    }
}
