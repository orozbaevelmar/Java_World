package CodeForces.Level_A;

import java.util.Scanner;
public class A96 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int len=str.length();

        char[] arr=str.toCharArray();
        int k=0;
        int lenFor=0;
        if (len>=7) lenFor=6;
        for (int j=0; j<len-6; j++) {

            for (int i = 0; i < lenFor; i++) {
                if (arr[j + i] == arr[j + i + 1]) k++;
                }
            if (k < 6) k = 0;
            else if (k >=6) {
                System.out.println("YES");
                break;
            }
            }
        if (k < 6) System.out.println("NO");
    }
}
