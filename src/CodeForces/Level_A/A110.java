package CodeForces.Level_A;
import java.util.Scanner;
public class A110 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int len=str.length();
        int k=0;
        for(int i=0; i<len; i++){
            char ch=str.charAt(i);
            if (ch=='4' || ch=='7') k++;
        }
        if (k==4 || k==7) System.out.println("YES");
        else System.out.println("NO");
    }
}
