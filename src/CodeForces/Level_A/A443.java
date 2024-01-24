package CodeForces.Level_A;

import java.util.Arrays;
import java.util.Scanner;

public class A443 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        char[] arrChar=str.toCharArray();
        Arrays.sort(arrChar);
        int k=0;
        for (char ch='a'; ch<='z'; ch++){
            for (int i=0; i<arrChar.length; i++){
                if (ch==arrChar[i]) {
                    k++;
                    break;
                }
            }
        }
        System.out.println(k);
    }
}
