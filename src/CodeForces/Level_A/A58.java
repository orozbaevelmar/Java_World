package CodeForces.Level_A;

import java.util.Scanner;

public class A58 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int len = str.length();
        char[] ch = new char[]{'h', 'e', 'l', 'l', 'o'};
        int sum = 0;
        int j=0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ch[j]) {
                j++;
                sum++;
                if (j==5) break;
            }
        }
        if(sum==5) System.out.println("YES");
        else System.out.println("NO");
    }
}
