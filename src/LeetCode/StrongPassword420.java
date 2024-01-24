package LeetCode;

import java.util.ArrayList;

public class StrongPassword420 {
    public static void main(String[] args) {
        String password="ABABABABABABABABABAB1";
                                                // A1234567890aaabbbbccccc---4
                                                // FFFFFFFFFFFFFFF11111111111111111111AAA---23
                                                // aaaabbbbccccddeeddeeddeedd---8
                                                    // bbaaaaaaaaaaaaaaacccccc---8
                                                    // ABABABABABABABABABAB1---2
        // A1234567890aa(a)bb(bb)ccFxcc
        // (F-FF-FF-FF-FF-FF-FF)-FF11-(11-11)-11R11R11R11R11AA-(A)

        // aaFabbFbccFcddeeddeeddeedd
        // aaaa-bb-bbccFcddeeddeeddeedd
        // (aa)aa(bb)bb(cc)ccddeeddeeddeedd


        boolean boolAZ=false;
        boolean boolaz=false;
        boolean bool19=false;

        int similarchar=1, simsum=0, lowUpDig=0;

        for (int i=0; i<password.length(); i++){
            if (password.charAt(i)>='A' && password.charAt(i)<='Z'){
                boolAZ=true;
            }
            if (password.charAt(i)>='a' && password.charAt(i)<='z'){
                boolaz=true;
            }
            if (password.charAt(i)>='0' && password.charAt(i)<='9'){
                bool19=true;
            }
            if (i>0 && password.charAt(i)==password.charAt(i-1)) {
                similarchar++;
            }
            else {
                simsum+=similarchar/3;
                similarchar=1;
            }
        }
        simsum+=similarchar/3;

        if (boolAZ==false) lowUpDig++;
        if (boolaz==false) lowUpDig++;
        if (bool19==false) lowUpDig++;
        int vergleich=Math.max(simsum, lowUpDig);

        if (password.length()<6){
            if (password.length()+vergleich>5) System.out.println(vergleich);
            else System.out.println(6-password.length());
        }
        else if (password.length()>=6 && password.length()<21) System.out.println(vergleich);
        else {
            int len=password.length();
            int g=1;
            ArrayList <Integer> list=new ArrayList<>();
            for (int j=1; j<len; j++) {
                if (password.charAt(j) == password.charAt(j - 1)) g++;
                if (password.charAt(j) == password.charAt(j - 1) && len-1!=j) continue;
                list.add(g);
                g=1;
            }
            if (password.charAt(len-1)!=password.charAt(len-2)) list.add(1);

            for (int j=0; j<len; j++) {
                for (int i = 0; i < list.size(); i++) {
                    if (len == 20) break;
                    if (list.get(i) > 2 && list.get(i) % 3 == 0) {
                        list.set(i, list.get(i) - 1);
                        len--;
                    }
                }
                for (int i = 0; i < list.size(); i++) {
                    if (len > 19 && len < 22) break;
                    if (list.get(i) > 2 && list.get(i) % 3 == 1) {
                        list.set(i, list.get(i) - 2);
                        len -= 2;
                    }
                }
                for (int i = 0; i < list.size(); i++) {
                    if (len > 19 && len < 23) break;
                    if (list.get(i) > 2 && list.get(i) % 3 == 2) {
                        list.set(i, list.get(i) - 3);
                        len -= 3;
                    }
                }
            }
            int abc=0;
            for (int d=0; d<list.size(); d++) {
                if (list.get(d) > 2) {
                    abc += (list.get(d) / 3);
                }
            }
            System.out.println(password.length()-len+len-20+Math.max(abc,lowUpDig));
        }
    }
}
