package CodeForces.Level_A;

import java.util.Arrays;
import java.util.Scanner;

public class A520 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String str= scan.next();
        str=str.toLowerCase();
        char[] arr=str.toCharArray();
        Arrays.sort(arr);

        int k=0;
        for (char ch='a'; ch<='z'; ch++){
            for (int i=0; i<n; i++){
                if (ch==arr[i]) {
                    k++;
                    break;
                }
            }
        }
        if (k==26) System.out.println("YES");
        else System.out.println("NO");
    }
}
