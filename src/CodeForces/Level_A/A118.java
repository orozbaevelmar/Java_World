package CodeForces.Level_A;

import java.util.Locale;
import java.util.Scanner;

public class A118 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String str = num.nextLine();
        str=str.toLowerCase(Locale.ROOT);
        int len = str.length();
        int k = 0;
        int k1 = 0;

        String strglasnyi = "aoyeui";
        StringBuffer stbfr = new StringBuffer(str);

        for (int j = 0; j < len; j++) {
            k++;

            char ch2 = str.charAt(j);

            for (int i = 0; i < 6; i++) {
                char ch = strglasnyi.charAt(i);
                if (ch2 == ch) {
                    stbfr.delete(k1, k);
                    k1--;
                    k--;
                }
            }
            k1++;
        }
        StringBuffer sb = new StringBuffer(stbfr);
        int len10 = stbfr.length();
        {
            for (int j10 = 0; j10 < (2 * len10); j10++) {
                sb.insert(j10++, ".");
            }
        }
        System.out.println(sb);
    }
}
