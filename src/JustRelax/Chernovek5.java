package JustRelax;

import java.util.*;

public class Chernovek5 {
    int arr[] = { 1, 3, 5, 7, 9, 11 };
    int segArr[];

    Chernovek5(int arr[], int len){
        int height = (int)( Math.ceil(Math.log(len)/Math.log(2)));
        int maxSizeOfST = 2 * (int) Math.pow(2, height) - 1;
        segArr = new int[maxSizeOfST];

        constructST(arr, 0, len-1, 0);
    }
    //  arr[] = { 1, 3, 5, 7, 9, 11 }
    private int constructST(int arr[], int ss, int se, int si){
        if (ss == se) {
            segArr[si] = arr[ss];
            return arr[ss];
        }

        int mid = ss + (se - ss) / 2;
        segArr[si] = constructST(arr, ss, mid, 2*si+1) +
                     constructST(arr, mid+1, se, 2*si+2);
        return segArr[si];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9, 11 };
        Chernovek5 ch = new Chernovek5(arr, arr.length);
        System.out.println(Arrays.toString(ch.segArr));
    }
}