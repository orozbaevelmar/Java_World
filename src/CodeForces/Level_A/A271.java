package CodeForces.Level_A;

import java.util.Scanner;

public class A271 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        for (int i = 0; i < 1000; i++) {
            y++;
            int y1 = y % 10;
            int y10 = ((y - y1) / 10) % 10;
            int y100 = ((((y - y1) / 10) - y10) / 10) % 10;
            int y1000 = y / 1000;
            if (y1 != y10 && y1 != y100 && y1 != y1000 && y10 != y100 && y10 != y1000 && y100 != y1000) {
                System.out.println(y);
                break;
            }
        }
    }
}
