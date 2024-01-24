package CodeForces.Level_A;

import java.util.Scanner;

public class A69 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0, xyz=0;
        for (int i=0; i<(3*n); i++){
            xyz= scan.nextInt();
            sum+=xyz;
        }
        if (sum==0) System.out.println("YES");
            
        else System.out.println("NO");
    }
}
