package CodeForces.Level_A;
import java.util.Scanner;
public class A231 {
    public static void main(String[] args)  {
        Scanner num=new Scanner(System.in);
        int ekran= num.nextInt();
        int scan;
        int SumLine;
        int n=0;

        for (int j=0; j<ekran; j++){
            SumLine =0;
            for(int b=0; b<3; b++){
                scan= num.nextInt();
                if(scan>0) SumLine++;
            }
            if(SumLine >1) ++n;
        }
        System.out.println(n);
    }
}