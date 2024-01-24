package LeetCode;

public class Pal_9 {
    public static void main(String[] args) {
       Solution res=new Solution();
       boolean bool=res.isPalindrome(-121);
        System.out.println(bool);
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        int j1=x;
        int k;
        int bis = 1;
        int bis1=1;
        int sum=0;
        for (int i1 = 0; i1 < bis1; i1++) {
            j1 = (j1 - (j1 % 10)) / 10;
            bis1++;
            if (j1 == 0) break;
        }
        int bis8=bis1-2;
        int [] arr=new int[bis1-1];
        int [] arr2=new int[bis1-1];
        for (int i = 0; i < bis; i++) {
            k = x % 10;
            x = (x - (x % 10)) / 10;
            bis++;
            arr[i]=k;
            arr2[bis8]=k;
            bis8--;
            if (x == 0) break;
        }
        for (int d=0; d<bis1-1; d++) {
            if (arr[d]==arr2[d]) sum++;
        }
        if(x<0) return false;
        else if(sum==bis-1) return true;
        else return false;
    }
}