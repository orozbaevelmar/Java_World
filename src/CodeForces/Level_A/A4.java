package CodeForces.Level_A;
import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
        long b1 = System.currentTimeMillis();
        Scanner num=new Scanner(System.in);
        int i=0;
        i=num.nextInt();

            if(i>2 && i%2==0) {
            System.out.println("Yes");
        }
            else {
                System.out.println("Not");
        }
        System.out.println((double) (System.currentTimeMillis() - b1));
        }
}
