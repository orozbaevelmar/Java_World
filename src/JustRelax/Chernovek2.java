package JustRelax;

import java.util.HashMap;
import java.util.Map;

public class Chernovek2 {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String result;
        char[] arr = new char[s.length()];
        arr[0] = s.charAt(0);
        int i = 1;
        int len=numRows*2-2;
        while (len*i < s.length()) {
            arr[i] = s.charAt(len*i);
            i++;
        }
        int j=1;
        arr[i]=s.charAt(j);
        j++;
        i++;
        while (j*numRows-1<s.length() && j+numRows-2<s.length()){
            arr[i]=s.charAt(j*numRows-1);
            j++;
            i++;
            arr[i]=s.charAt(j+numRows-2);
            j++;
            i++;
        }


        System.out.println();
        System.out.println();
        String s1=new String(arr);
        System.out.println(s1);

        /*for (int j=0; j<arr.length; j++){
            System.out.println(arr[j]);
        }*/
    }
}