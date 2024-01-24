package CodeForces.Level_A;

import java.util.Arrays;
import java.util.Scanner;

public class A405 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n];
        for (int i=0; i<n; i++){
            a[i]=scan.nextInt();
        }
        Arrays.sort(a);
        for (int j=0; j<n; j++){
            System.out.print(a[j]+" ");
        }
    }
}
