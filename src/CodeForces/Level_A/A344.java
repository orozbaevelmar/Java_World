package CodeForces.Level_A;

import java.util.Scanner;

public class A344 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        int k=1;
        for (int i=0; i<n; i++){
            arr[i]= scan.nextInt();
        }
        for (int j=0; j<n-1; j++){
            if (arr[j]!=arr[j+1]) k++;
        }
        System.out.println(k);
    }
}
