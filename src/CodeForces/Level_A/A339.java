package CodeForces.Level_A;
import java.util.Arrays;
import java.util.Scanner;
public class A339 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String str = num.nextLine();
        int len = ((str.length()) / 2)+1;
        int d;
        int k=0;

        char[] arr=new char[len];

        for (d=0; d<str.length(); d=d+2) {
            char ch = str.charAt(d);

            arr[k]=ch;
            k++;
        }
        Arrays.sort(arr);
        for (int i=0; i<=len-1; i++){
            System.out.print(arr[i]);
            if ((len-1)>i) System.out.print("+");
        }
    }
}