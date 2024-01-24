package CodeForces.Level_A;

import java.util.Scanner;

public class A479 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int sum=0;
        int jede;
        jede=a+b*c;
        if (jede>sum) sum=jede;
        jede=a*(b+c);
        if (jede>sum) sum=jede;
        jede=a*b*c;
        if (jede>sum) sum=jede;
        jede=(a+b)*c;
        if (jede>sum) sum=jede;
        jede=a+b+c;
        if (jede>sum) sum=jede;
        System.out.println(sum);
    }
}
