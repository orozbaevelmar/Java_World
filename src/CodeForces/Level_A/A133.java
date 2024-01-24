package CodeForces.Level_A;

import java.util.Scanner;

public class A133 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        char[] ch=new char[]{'H', 'Q', '9', '+'};
        int k=0;
        for (int i=0; i<str.length(); i++){
            for (int j=0; j<4; j++) {
                if (str.charAt(i) == ch[j]) {
                    System.out.println("YES");
                    break;
                }else k++;
            }
        }
        if (k/4==str.length()) System.out.println("NO");
    }
}
