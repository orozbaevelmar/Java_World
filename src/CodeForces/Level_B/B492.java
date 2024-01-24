package CodeForces.Level_B;

import java.util.Arrays;
import java.util.Scanner;

public class B492 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int laternesAnzahl=scan.nextInt();
        long strassesLange=scan.nextInt();

        long[] arr=new long[laternesAnzahl];
        for (int i=0; i<laternesAnzahl; i++){
            arr[i]=scan.nextLong();
        }
        Arrays.sort(arr);
        double sum=0;
        long jederMassiv;
        for(int i=1; i<laternesAnzahl; i++){
            jederMassiv=arr[i]-arr[i-1];
            if (sum<jederMassiv) sum=jederMassiv;
        }
        sum/=2;

        long anfangen0=arr[0]-0;
        long letzte=strassesLange-arr[laternesAnzahl-1];
        double sum0_15=0;
        if (anfangen0>letzte) sum0_15=anfangen0;
        else sum0_15=letzte;

        if (sum>sum0_15) System.out.println(sum);
        else System.out.println(sum0_15);
    }
}
