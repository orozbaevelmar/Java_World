package CodeForces.Level_A;
import java.util.Scanner;
public class A71 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int n=num.nextInt();
        String s;
        for(int i=0;i<n;i++){
            s=num.next();
            int len=s.length();
            if (len<=10){
                System.out.println(s);}

            else{
                char a=s.charAt(0);
                int b=s.length()-2;
                char c=s.charAt(len-1);
                System.out.println(a+""+b+""+c);
            }
        }
    }
}
