package CodeForces.Level_A;

import java.util.Scanner;

public class A546 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k=scan.nextInt();
        long n= scan.nextLong();
        int w= scan.nextInt();
        int skolko=0;
        int abc=0;
        for(int i=1; i<=w; i++){
            skolko=k*i;
            abc=skolko+abc;

        }
        if (abc>n) System.out.println(abc-n);
        else System.out.println("0");
    }
}
