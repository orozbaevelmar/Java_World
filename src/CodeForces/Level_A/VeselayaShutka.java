package CodeForces.Level_A;

import java.util.Scanner;

public class VeselayaShutka {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long l=scan.nextLong();
        int len=0;
        if (l >= 100) {
            len += (l / 100);
            l %= 100;
            System.out.println(len+"   "+l);
        }
        if (l >=20){
            len += (l / 20);
            l %= 20;
            System.out.println(len+"   "+l);
        }
        if (l>=10){
            len += (l / 10);
            l %= 10;
            System.out.println(len+"   "+l);
        }
        if (l>=5){
            len += (l / 5);
            l %= 5;
            System.out.println(len+"   "+l);
        }
        if (l>=1){
            len += (l / 1);
            l %= 1;
            System.out.println(len+"   "+l);
        }
    }
}
