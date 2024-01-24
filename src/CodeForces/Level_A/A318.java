package CodeForces.Level_A;

import java.util.Scanner;

public class A318 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        long n= scan.nextLong();
        long k=scan.nextLong();
        long sum=k*2-1;
        long sum5=0;
        if (sum<=n) System.out.println(sum);
        else if (n%2!=0) {
            sum5=(k-(n/2+1))*2;
            System.out.println(sum5);
        }
        else {
            sum5=(k-(n/2))*2;
            System.out.println(sum5);
        }
        /*int n=scan.nextInt();
        int k=scan.nextInt();
        int[] arr=new int[n];
        int[] arr5=new int[n];
        int g=0;
        for (int i=0; i<n; i++){
            arr[i]=i+1;
            if (arr[i]%2!=0){
             arr5[g]=arr[i];
            g++;
            }
        }
       for (int d=0; d<n; d++){
           if (arr[d]%2==0){
               arr5[g]=arr[d];
               g++;
           }
       }
       System.out.println(arr5[k-1]);*/
    }
}
