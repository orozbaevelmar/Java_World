package CodeForces.Level_A;

import java.util.Scanner;

public class A122 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if (n%4==0 || n%7==0 || n%47==0 || n%74==0 || n%447==0 || n%474==0 || n%477==0 || n%744==0 || n%747==0 || n%774==0) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
