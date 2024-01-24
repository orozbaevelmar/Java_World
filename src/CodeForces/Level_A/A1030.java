package CodeForces.Level_A;

import java.util.Scanner;

public class A1030 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int sum=0;
        for (int i=0; i<n; i++){
            int d= scan.nextInt();
            sum+=d;
        }
        if (sum>0) System.out.println("HARD");
        else System.out.println("EASY");
    }
}
