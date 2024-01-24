package CodeForces.Level_A;

import java.util.Arrays;
import java.util.Scanner;

public class A469 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i;
        int p=scan.nextInt();
        int [] arr5=new int[p];
        for (i=0; i<p; i++){
            arr5[i]=scan.nextInt();
        }
        int q=scan.nextInt();
        int[] arr=new int[p+q];
        for (i=i; i<p+q; i++){
            arr[i]= scan.nextInt();
        }
        for (int k=0; k<p; k++){
            arr[k]=arr5[k];
        }
        Arrays.sort(arr);
        int ost=1;
        int sum=0;
        for (int j=0; j<p+q; j++) {
            if (arr[j] == ost){
                ost++;
                sum++;
            }
        }
        if (sum==n) System.out.println("I become the guy.");
        else System.out.println("Oh, my keyboard!");
    }
}
