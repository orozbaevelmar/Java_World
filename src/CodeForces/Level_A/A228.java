package CodeForces.Level_A;

import java.util.Arrays;
import java.util.Scanner;

public class A228 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=4;
        long [] arr=new long[n];
        arr[0]=scan.nextLong();
        for (int i=1; i<n; i++){
            arr[i]=scan.nextLong();
        }
        Arrays.sort(arr);
        int k=0;
        for (int j=1; j<n; j++){
            if (arr[j-1]==arr[j]) k++;
        }
        System.out.println(k);
    }
}
