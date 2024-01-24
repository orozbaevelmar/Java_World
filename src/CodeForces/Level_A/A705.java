package CodeForces.Level_A;

import java.util.Scanner;

public class A705 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String str="I hate it";
        String str4=" that I love";
        String str5=" that I hate";
        StringBuffer stb=new StringBuffer(str);
        int len;
        for(int i=0; i<n; i++){
            if (i==n-1) break;
            len=stb.length()-3;
            stb.insert(len, str4);
            if (i==n-2) break;
            i++;
            len=stb.length()-3;
            stb.insert(len, str5);
        }
        System.out.println(stb);
    }
}
