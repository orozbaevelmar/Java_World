package CodeForces.Level_A;

import java.util.Scanner;

public class A677 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int h=scan.nextInt();
        int k=0;
        int sum=0;
        for (int i=0; i<n; i++){
            int a=scan.nextInt();
            if (a>h) {
                k+=2;
                sum+=k;
                k=0;
            }
            else {
                k++;
                sum+=k;
                k=0;
            }
        }
        System.out.println(sum);
    }
}
