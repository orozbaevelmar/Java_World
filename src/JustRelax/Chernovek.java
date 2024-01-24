package JustRelax;

public class Chernovek {
    public static void main(String[] args) {
        Efj f=new Efj(10);
        System.out.println(f.h);
        System.out.println(Abcd.h);
        Abcd a=new Abcd(3);
        System.out.println(f.c);
        System.out.println(a.h);
    }
}
class Abcd{
    static int h;
    Abcd(int i){
        h=i;
    }
}
class Efj extends Abcd{
    int c;
    Efj(int g){
        super(8);
        c=g;

    }
}
