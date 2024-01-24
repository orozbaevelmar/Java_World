package LeetCode;

import java.util.Scanner;

public class ShifrVijnera {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String soz=scan.nextLine();
        String kliuch=scan.nextLine();

        soz=soz.toLowerCase();
        kliuch=kliuch.toLowerCase();

        char[] charSoz=soz.toCharArray();
        char[] charKliuch=kliuch.toCharArray();
        char[] charRasschifrovka=new char[soz.length()];

        int g=0;

        for(int i=0; i<soz.length(); i++){
            charRasschifrovka[i]=(char)(charSoz[i]+charKliuch[g]-'a');

            if (charRasschifrovka[i]<='z') {
                System.out.print(charRasschifrovka[i]);
            }
            else System.out.print((char)(charSoz[i]+charKliuch[g]-'{'));

            g++;
            if (g==kliuch.length()) g=0;
        }
    }
}
