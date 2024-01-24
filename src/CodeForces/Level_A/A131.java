package CodeForces.Level_A;

import java.util.Scanner;

public class A131 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int k=0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) >96) {
                k = 1;
                break;
            }
        }
        String anfang=String.valueOf(str.charAt(0));
        StringBuilder stbf=new StringBuilder(str);
        stbf=stbf.deleteCharAt(0);
        String satze=stbf.toString();
        satze=satze.toLowerCase();
        int m=0;
        for (int i=1; i<str.length(); i++){
            if (str.charAt(i)>96){
                m=1;
                break;
            }
        }
        if (m!=1 && anfang.charAt(0)>96) {
            anfang=anfang.toUpperCase();
            System.out.println(anfang+satze);
        }
        else if (k!=1) System.out.println(str.toLowerCase());
        else System.out.println(str);
    }
}
