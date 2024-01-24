package CodeForces.Level_A;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class A236 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str10=scan.nextLine();
        str10=str10.toLowerCase(Locale.ROOT);
        int lenscan=str10.length();

        char[] ch=str10.toCharArray();
        Arrays.sort(ch);

        int k=0;

        for (int i=0; i<lenscan-1; i++){
            if (ch[i]==ch[i+1]) {
                k++;
            }
        }
        int sum=lenscan-k;
        if (sum % 2==0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}
