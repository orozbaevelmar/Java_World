package CodeForces.Level_A;

import java.util.Scanner;

public class A268 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        int[] array=new int[n];
        for (int i=0; i<n; i++){
            arr[i]=scan.nextInt();
            array[i]=scan.nextInt();
        }
        int sum=0;
        for (int j=0; j<n; j++){
            for (int k=0; k<n; k++){
                if (arr[j]==array[k]) sum++;
            }
        }
        System.out.println(sum);
    }
}
