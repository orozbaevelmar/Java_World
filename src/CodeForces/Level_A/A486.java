package CodeForces.Level_A;
import java.util.Scanner;
public class A486 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        long n=scan.nextLong();
        if (n%2==0) n=n/2;
        else n=(-n/2)-1;
        System.out.println(n);
    }
}
