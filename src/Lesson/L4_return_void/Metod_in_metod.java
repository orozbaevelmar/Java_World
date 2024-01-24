package Lesson.L4_return_void;

public class Metod_in_metod {
    int summa(int a, int b, int c){
        int result=a+b+c;
        return result;
    }

    int sredneArifma(int x,int y, int z){
        int result2=summa(x, y, z)/3; // ����� � ������ ( SUMMA ) Leichter;
        // (ODER) int result2=(x+y+z)/3; Schwer
        return result2;
    }
}
class   Metod_in_metod_Print{
    public static void main(String[] args) {
        Metod_in_metod ab=new Metod_in_metod();
        int res=ab.sredneArifma(10, 20, 30);
        System.out.println(res);
    }
}
