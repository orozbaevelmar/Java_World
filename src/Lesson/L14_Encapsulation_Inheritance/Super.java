package Lesson.L14_Encapsulation_Inheritance;

public class Super {
    String s1="Privet";
    static double pi= 3.14;
    int summa(int ... i){
        int result = 0;
        for(int a:i){
            result+=a;

        }
        return result;
    }
    static void abc(){
        System.out.println("static method");
    }

}

class B10 extends Super{
    /*String s1 = super.s1 + ", drug!";*/
// Если в этом PI и S1 сделаем HIDE, то нужно написать Super
    double pi=super.pi;
    String s1=super.s1;
    int summa(int ... i){
        int result  = super.summa(i); /*int result=0;
                                        for (int a:i){
                                        result+=a;
                                        }*/
        System.out.println("Summa:"+result);
// При обращении к методу родителького класса, выражение SUPER не обьязательно должно быть первой строкой тело метода
        super.abc();
        return result;
    }

    public static void main(String[] args) {
        B10 b=new B10();
        System.out.println(b.s1);

    }
}