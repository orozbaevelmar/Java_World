package CodeForces.Level_A;

import java.util.Scanner;
public class A263 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int [][] arr = new int[5][5];
        int a, b, sum=0;
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++) {
                arr[i][j]= num.nextInt();
                if (arr[i][j]==1) {
                    b=i;
                    a=j;
                    if (a<=2 && b<=2) sum=(2-a)+(2-b);
                    else if (a<2 && b>2) sum=(2-a)+(b-2);
                    else if (b<2 && a>2) sum=(a-2)+(2-b);
                    else sum=(a-2)+(b-2);
                    System.out.println(sum);
                }
            }
        }
    }
}
