package CodeForces.Level_A;

import java.util.Scanner;

public class A136 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr5=new int[n];
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scan.nextInt();
        }
        for (int j=0; j<n; j++){
            arr5[arr[j]-1]=j+1;
        }
        for (int d=0; d<n; d++){
            System.out.println(arr5[d]);
        }
    }
}
