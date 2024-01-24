package Lesson.L3_Array_varargs;

import java.util.Arrays;

//  Arrays.____

// .asList(T... a)
// .compare(arr1, arr2)    {a=b --->0}   {a>b --->1}   {a<b --->-1}
// .mismatch(arr1, arr2) ---> {a=b ---> -1} находит индекс где они перестают быть похожими;
// .binarySearch(Dtype[] a, Dtype key)
// .copyOf(Dtype[] original, int newLength)
// .copyOfRange(boolean[] original, int from, int to)
// .equals(double[] a, double[] a2)
// .equals(double[] a, int aFromIndex, int aToIndex, double[] b, int bFromIndex, int bToIndex)
// .fill(int[] a, int val)
// .fill(long[] a, int fromIndex, int toIndex, long val)
// .mismatch(long[] a, long[] b)
// .mismatch(long[] a, int aFromIndex, int aToIndex, long[] b, int bFromIndex, int bToIndex)
// .sort(long[] a)
// .sort(long[] a, int fromIndex, int toIndex)
// .toString(long[] a)
// .
public class Arrays_Method {
    public static void main(String[] args) {

        int i=2;
        String s=new String[]{"A","B","C","D","E"}[i];
        System.out.println(s);

        int[] array1 = {1, 2, 3, 4, 5};  // 1, 2, 3 --->Prefix
        int[] array2 = {1, 2, 3, 5};
        int[] array5 = {1, 2, 3, 5};

        System.out.println(Arrays.compare(array1, array2));
        System.out.println(Arrays.compare(array2, array1));
        System.out.println(Arrays.compare(array2, array5));

        char[] arr={'p','r','i','v','e','t'};   // priv --->PREFIX
        char[] arr2={'p','r','i','v','i','v','k','a'};

        System.out.println();
        System.out.println(Arrays.mismatch(array2, array5));
        System.out.println(Arrays.mismatch(array1, array5));


    }
}
