package CodeForces.Level_A;

import java.util.Scanner;

public class A977 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int k= scan.nextInt();

        int nnn;
        for (int i=0; i<k; i++){
            nnn=n%10;
            if (nnn==0) n/=10;
            else n-=1;
        }
        System.out.println(n);
    }
}
