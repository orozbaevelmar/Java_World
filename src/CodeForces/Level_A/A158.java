package CodeForces.Level_A;

import java.util.Scanner;

public class A158 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int k = num.nextInt();
        int b;

        int bOnly=0;
        int bViele=0;
        int ostatok=0;

        int neRavno=0;
        for (int j=0; j<k-1; j++){
            b=num.nextInt();
        if (b>0) neRavno++; }
        for(int i=k-1; i<k; i++) {
            b = num.nextInt();
            bOnly=b;
        }
        for (int d=k; d<n; d++){
            b=num.nextInt();
            bViele=b;

            if (bOnly==bViele & bOnly>0 & bViele>0) {
                ostatok++;
            }

            else if (bOnly != bViele) break;
        }
        if (bOnly==0) {
            ostatok=0;
            k=0;
        }
        if (bOnly>0) neRavno=0;

        int sum=k+ostatok+neRavno;
        System.out.println(sum);
    }
}
