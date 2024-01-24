package Lesson.L3_Array_varargs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// Arrays.sort(arr)
// Arrays.binarySearch(array, value) --> работает после сорта

public class Massiv {
    public static void main(String[] args) {

//Wie Summary leicht Array
        int[] sumArr=new int[]{234,4353,657,323,534,657};
        int sum= IntStream.of(sumArr).sum();
        System.out.println("ohne Loop="+sum);

        String[] fill=new String[5];
        Arrays.fill(fill, "Hello");
        List<String> list= Arrays.asList(fill);
        System.out.println(list);

        float [] arr = new float [] {56.2F, 23.4F, 23.4F, 432.4F};

        for (int i=0; i<4; i++) {
            System.out.println("Element " + i + " is " + arr[i]);
        }
/*      1-way
        int [] arr=new int [] {32, 54, 575};

      2-way
        int [] arr;
        arr=new int [] {32, 54, 575};
        System.out.println(arr[2]);

      3-way
         int [] arr = new int [3];
         arr[0] = 23;
         arr[2] = 657;
         System.out.println(arr[2]); */
// sort
        int[] array={10,7,-8,5,-1,3,15};
        Arrays.sort(array);
        for (int i : array){
            System.out.print(i+" ");
        }
        int index=Arrays.binarySearch(array,7);
        System.out.println("\n"+index);
    }
}
