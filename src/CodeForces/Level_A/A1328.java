package CodeForces.Level_A;

import java.util.Scanner;

public class A1328 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for (int i=0; i<t; i++){
            int a=scan.nextInt();
            int b=scan.nextInt();
            int ost;
            if (a%b==0) System.out.println(0);
            else if (a%b!=0) {
                ost=a/b;
                ost++;
                b=b*ost;
                int sum=b-a;
                System.out.println(sum);
            }
        }
    }
}
