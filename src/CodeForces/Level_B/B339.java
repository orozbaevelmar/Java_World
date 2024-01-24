package CodeForces.Level_B;

import java.util.Scanner;

public class B339 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int a=1;
        int ost=1;
        int anf;
        int sum=0;
        int atk;
        for (int i=0; i<m; i++){
            a=scan.nextInt();
            if (ost>a) {
                anf=n-ost+1+a-1;
                sum+=anf;
                anf=0;
            }
            else {
                atk=a-ost;
                sum+=atk;
                atk=0;
            }
            ost=a;
        }
        System.out.println(sum);
    }
}
/*      int n=scan.nextInt();
        int m=scan.nextInt();
        int [] arr=new int[n*m];
        int k=0;
        int[] arr8=new int[m+1];
        int sum=0;

        for (int i = 0; i < n * m; i++) {
            k++;
            arr[i] = k;
            if (k == n) k = 0;
        }
        for (int j=0; j<m; j++){
            arr8[j]= scan.nextInt();
        }
        int ost=0;
        for (int d = 0; d < n * m; d++) {
            sum++;
            if (arr8[ost]==arr[d] && arr8[ost]!=arr8[ost+1]) {
                ost++;
            }
            if (ost==m) break;
            if (arr8[ost]==arr8[ost+1]) {
                d--;
                ost++;
                sum--;
            }
        }
        System.out.println(sum-1);*/
