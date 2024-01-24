package CodeForces.Level_A;

import java.util.Scanner;

public class A59 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int len=str.length();

        char[] ch=str.toCharArray();
        int k=0;
        int n=0;

        String end="";
        for (int i=0; i<len; i++){
            if (ch[i]<91 && ch[i]>64) k++;
            else if (ch[i]<123 && ch[i]>96) n++;
        }
        if (k>n) end=str.toUpperCase();
        else if (k<n || k==n) end=str.toLowerCase();
        System.out.println(end);
    }
}
