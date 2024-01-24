package CodeForces.Level_A;

import java.util.Scanner;

public class A144 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];

        int ost, tof;
        for (int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        ost=arr[0];
        tof=arr[0];
        int max=1, min=1;
        for (int i=0; i<n; i++) {
            if (arr[i] > ost) {
                ost=arr[i];
                max = i+1;
            }
            if (arr[i] <= tof ) {
                tof=arr[i];
                min = i+1;
            }
        }
        int sum=0;
        if (max<min && max!=1) sum=max-1+n-min;
        else if (max==1) sum=n-min;
        else sum=max-2+(n-min);
        System.out.println(sum);
    }
}
