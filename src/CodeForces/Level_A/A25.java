package CodeForces.Level_A;

import java.util.Scanner;

public class A25 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for (int i=0; i<n; i++){
            arr[i]=scan.nextInt();
        }
        int[] vergleichen=new int[n];
        for (int i=1; i<n; i++){
            vergleichen[i-1]=arr[i]-arr[i-1];
            System.out.println(vergleichen[i-1]);
        }
        int ergebnis=0;
        for (int i=1; i<n; i++){
            if (vergleichen[i]!=vergleichen[i-1]){
                ergebnis=i;
                break;
            }
        }
        System.out.println(ergebnis+2);
    }
}
