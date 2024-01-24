package CodeForces.Level_A;

import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int m=num.nextInt(), n= num.nextInt(), a= num.nextInt();
        long k, f;
        long sum;
        k=m/a;
        f=n/a;
        if (m%a != 0) k++;
        if (n%a != 0) f++;
        sum=k*f;
        System.out.println(sum);
    }
}
/*    int m=num.nextInt(), n= num.nextInt(), a= num.nextInt();
    int c=a, b=a;
    long k=1, f=1;
    long sum;
        while (m>a){
                a =c+ a;
                k++;
                System.out.println("k="+k);
                }
                while (n>b){
                b =c+ b;
                f++;
                }
                sum=k*f;
                System.out.println(sum);*/

