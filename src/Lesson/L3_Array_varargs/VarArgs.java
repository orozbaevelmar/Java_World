package Lesson.L3_Array_varargs;

// int ... a  == new int[]
// sum(1,2,3) == (new int[]{1,2,3}
// В листе параметров метода может быть только 1varargs
// В листе параметров метода varargs должен стоять самым последним
// int [] ... a --->двумерный массив

public class VarArgs {

    static void summa(int a, int b){
        System.out.println(a+b);
    }

    static void summa(int a, int b, int c){
        System.out.println(a+b+c);
    }

    static void summa(int a, int b, int c, int d /*параметров может быть бесконечно*/){
        System.out.println(a+b+c+d);
    }

    //поэтому придумали Varargs
    static void sum(int ... a){
        int summa=0;
        for (int i=0; i<a.length; i++){
            summa+=a[i];
        }
        System.out.println(summa);
    }

    static void abc(int a){
        System.out.println("Hello"); // наиболее точному совподению
    }
    static void abc(int ... a){
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        sum(1,3,2,3,4,3,2,43,76,9,8,5);

        abc(4);
    }
}

