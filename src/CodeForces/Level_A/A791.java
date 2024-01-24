package CodeForces.Level_A;

import java.util.Scanner;

public class A791 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int limak= scan.nextInt();
        int boba=scan.nextInt();
        int k=0;
        for (int i=0; i<100; i++){
            limak=3*limak;
            for (int j=0; j<1; j++){
                k++;
                boba=2*boba;
            }
            if (limak>boba) break;
        }
        System.out.println(k);
    }
}
