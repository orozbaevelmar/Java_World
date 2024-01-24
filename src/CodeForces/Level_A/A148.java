package CodeForces.Level_A;

import java.util.Scanner;

public class A148 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int schlagMitDerPfanne=scan.nextInt();
        int schlagTur=scan.nextInt();
        int stiefelAbsatz=scan.nextInt();
        int erschrocken=scan.nextInt();
        int allGemeineDragons=scan.nextInt();
        int sum=0;
        for (int i=1; i<=allGemeineDragons; i++){
            if (i%schlagMitDerPfanne==0 || i%schlagTur==0 || i%stiefelAbsatz==0 || i%erschrocken==0) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
