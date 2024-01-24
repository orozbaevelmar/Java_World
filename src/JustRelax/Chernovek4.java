package JustRelax;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Chernovek4 {
    public static void main(String[] args) {
        int [] arr = { 1, 3, 5, 7, 9, 11 };
        Chernovek5 ch = new Chernovek5(arr, arr.length  );
        System.out.println(Arrays.toString(ch.segArr));
    }
}