package CodeForces.Level_A;

import java.util.Locale;
import java.util.Scanner;
public class A112 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        String vvod1 = num.nextLine();
        String vvod2 = num.nextLine();
        int g= vvod1.length();
        char ch1, ch2;
        int sum1=-1, sum2=1, sum=0;

        for (int i=0; i<g; i++) {
            ch1=vvod1.toLowerCase(Locale.ENGLISH).charAt(i);
            ch2=vvod2.toLowerCase(Locale.ENGLISH).charAt(i);
            if (ch1>ch2) {
                sum=sum2;
                break;
                }
            else if (ch1<ch2) {
                sum=sum1;
                break;
            }
            else sum=sum2+sum1;
        }
        System.out.println(sum);
    }
}
