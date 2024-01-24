package CodeForces.Level_A;

import java.util.Scanner;

public class A580 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []arr=new int[1];
        int ost=0;
        int sum=0;
        for (int i=0; i<n; i++){
            int a=scan.nextInt();
            if (arr[0]<=a && i>0) {
                ost++;
                if (sum < ost) sum = ost;
            }
            else if (arr[0]>a) ost=0;
            arr[0]=a;
        }
        System.out.println(sum+1);
    }
}
