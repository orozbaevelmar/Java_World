package CodeForces.Level_A;

import java.util.Scanner;

public class A61 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String str5=scan.nextLine();
        int len=str.length();
        for (int i=0; i<len; i++){
            char b=str.charAt(i);
            char b5=str5.charAt(i);
            if (b != b5) System.out.print("1");
            else System.out.print("0");
        }
    }
}
