package CodeForces.Level_B;

import java.util.Scanner;

public class B_266 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int t=scan.nextInt();
        String str1=scan.nextLine();
        String str=scan.nextLine();
        int len=str.length();

        char[] ch=str.toCharArray();

        for (int j=0; j<t; j++) {
            for (int i = 0; i < len-1; i++) {
                if (ch[i] == 'B' && ch[i+1]=='G') {
                    ch[i] = 'G';
                    ch[i + 1] = 'B';
                    i++;
                }
            }
        }
        for (int d=0; d<len; d++){
            System.out.print(ch[d]);
        }
    }
}
