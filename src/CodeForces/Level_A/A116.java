package CodeForces.Level_A;

import java.util.Scanner;

public class A116 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int losen=0;
        int vergleichen=0;

            for (int j=0; j<n; j++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                losen = (losen - a) + b;
                if (losen>vergleichen) vergleichen=losen;
            }
        System.out.println(vergleichen);
    }
}