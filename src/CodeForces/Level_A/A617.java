package CodeForces.Level_A;

import java.util.Scanner;

public class A617 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x= scan.nextInt();
        int way=5;
        int y=x/way;
        int k=0;
        if (x%way != 0) k=1;
        System.out.println(y+k);
    }
}
