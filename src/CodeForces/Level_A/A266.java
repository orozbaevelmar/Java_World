package CodeForces.Level_A;

import java.util.Scanner;

public class A266 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String str1=scan.nextLine();
        String str=scan.nextLine();
        int len=str.length();
        char[] ch=str.toCharArray();
        int k=0;
        for (int i=0; i<len-1; i++){
            if (ch[i]==ch[i+1]) k++;
        }
        System.out.println(k);
    }
}
