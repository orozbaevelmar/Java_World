package LeetCode;

import java.util.Scanner;

public class SchifrSezara {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String soz=scan.nextLine();

        soz=soz.toLowerCase();

        char[] charSoz=soz.toCharArray();
        char[] charRasschifrovka=new char[soz.length()];

        for(int i=0; i<soz.length(); i++){
            charRasschifrovka[i]=(char)(charSoz[i]+(char)3);

            if (charRasschifrovka[i]<='z') {
                System.out.print(charRasschifrovka[i]);
            }
            else System.out.print((char)(charSoz[i]+(char)3-(char)26));

        }
    }
}
