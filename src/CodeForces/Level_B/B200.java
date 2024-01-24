package CodeForces.Level_B;

import java.util.Scanner;

public class B200 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double n= scan.nextInt();
        double sum=0;
        for (int i=0; i<n; i++){
            double p=scan.nextInt();
            sum+=p/100;
        }
        System.out.println(sum/n*100);
    }
}
