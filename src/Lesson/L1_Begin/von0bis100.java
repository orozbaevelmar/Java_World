package Lesson.L1_Begin;

public class von0bis100 {
    public static void main(String[] args) {
        {int a=11;
        int b=3;
        int c=a/b;
        System.out.println("(int целое число, deswegen не 3.333,)  а="+c +"\n");}
//Остаток(%)
        {int a=11, b=3;
            int CelayaChast=a/b;   //11:3=3(2)
        int Ostatok=a%b;
        System.out.println("CelayaChast="+CelayaChast+ "\nOstatok="+Ostatok+"\n");}
// a++; a--;
        {int a=11, b=3;
        int postfix = a - b++;
        System.out.println("postfix=" + postfix + "  (сперва он минусовал а потом работает b++)");
        System.out.println("b=" + b);}

        {int a=11, b=3;
         int prefix = a - ++b;
        System.out.println("prefix=" + prefix + "  (сперва работает ++b, а потом минус)");
        System.out.println("b=" + b);}
// сумма a++
        {int a=5;    // a=5;   6;      5;      4;      5;  <----------
        int operation = (++a) - (--a) - (a--) + (a++); //            |
                      //  6   -   5   -   5   +   4    //            |
        System.out.println("operation=" + operation + ";   and   a="+a);}
//double=long=int
        {long l=100L;
        int i=10;
         l=i; // i=l WRONG long ne pomestitsa v int
        System.out.println("\nlong=" +l);
            double d=50.1F;
            d=i;
            System.out.println("double=" + d+"\n");}
//Операторы сравнения (boolean)
        {int a=3, c=5;
        boolean b = a >=c;
            System.out.println("(a>c=)"+b);}
//&&; ||;
        {boolean b1=true, b2=false;
            boolean c=b1&&b2;
            System.out.println(b1||b2);
            System.out.println(b1&&b2);
            System.out.println(c);}
// !true=false
        {System.out.println("\n(!true=)"+!true);}
// (XOR) ^ (Логическая исключающее (или)) Если только одна из них TRUE то выдаст TRUE,в остальных случаях False
        {boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = true;
            System.out.println("\n(XOR)  ( ^ )");
            System.out.println(b1^b2^b3^b4);
            System.out.println(b1^b2^b3);
        }
    }
}
