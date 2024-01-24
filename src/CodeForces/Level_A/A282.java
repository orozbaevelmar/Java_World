package CodeForces.Level_A;

import java.util.Scanner;

public class A282 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n=num.nextInt();
        String s;
        int k=0, f=0;
        int sum=0;
        for (int i=0; i<n; i++){
            s=num.next();
            if (s.equals("X++")) k++;
            else if (s.equals("++X")) k++;
            else f++;
            sum = k-f;
        }
        System.out.println(sum);
    }
}
