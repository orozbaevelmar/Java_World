package CodeForces.Level_A;

import java.util.Scanner;

public class A41 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String t=scan.nextLine();
        int lenS=s.length();
        int lenT=t.length();
        int j=0;

        int sum1=0;
        for (int i=lenS-1; i>=0; --i){
            if (s.charAt(i)==t.charAt(j)) sum1++;
            if (j<lenT-1) j++;
        }
       if (lenS==sum1) System.out.println("YES");
       else System.out.println("NO");
    }
}
