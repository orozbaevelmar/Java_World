package Lesson.L1_Begin;

import java.util.Arrays;

// Чтобы binarySearch сработал нужно sorting

public class MakeOppositeNumber {
    public static void main(String[] args) {
        int i=-5;
        if (i<0) i=~i;
        System.out.println(i);
        System.out.println("----------------");

        int j=10;
        j=~j;
        System.out.println(j);
        System.out.println("----------------");

        int []arr={1,5,7,18,47,89};

        int ind1= Arrays.binarySearch(arr, 7);
        System.out.println("ind1 = "+ind1);
        System.out.println("----------------");

        int ind2= Arrays.binarySearch(arr, 8);
        System.out.println("ind2 = "+ind2);
    }
}
