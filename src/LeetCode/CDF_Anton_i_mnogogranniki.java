package LeetCode;

import java.util.Scanner;

public class CDF_Anton_i_mnogogranniki {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int len=scan.nextInt();
        int sum=0;
        for (int i=0; i<len; i++){
            String s=scan.next();
            if (s.equals("Tetrahedron")) sum+=4;
            if (s.equals("Cube")) sum+=6;
            if (s.equals("Octahedron")) sum+=8;
            if (s.equals("Dodecahedron")) sum+=12;
            if (s.equals("Icosahedron")) sum+=20;
        }
        System.out.println(sum);
    }
}
