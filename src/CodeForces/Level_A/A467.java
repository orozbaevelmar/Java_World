package CodeForces.Level_A;
import java.util.Scanner;
public class A467 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=0;
        for(int i=0; i<n; i++){
            int p=scan.nextInt();
            int q=scan.nextInt();
            if (q-p>1) k++;
        }
        System.out.println(k);
    }
}
