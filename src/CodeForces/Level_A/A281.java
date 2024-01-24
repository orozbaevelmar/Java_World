package CodeForces.Level_A;

import java.util.Locale;
import java.util.Scanner;

public class A281 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        char ch=str.toUpperCase(Locale.ROOT).charAt(0);

        StringBuffer ostatok=new StringBuffer(str);
        ostatok.delete(0, 1);
        System.out.println(ch+""+ostatok);
    }
}
