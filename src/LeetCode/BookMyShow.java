package LeetCode;

import java.util.*;
public class BookMyShow {
    HashMap<Integer, Integer> map1 = new HashMap<>();
    int n, m;

    public BookMyShow(int n, int m) {
        for (int i = 0; i < n; i++) {
            map1.put(i, m);
        }
        this.n = n;
        this.m = m;
    }

    public int[] gather(int k, int maxRow) {
        int[] arr = new int[2];
        if (m>=k) {
            for (Map.Entry<Integer, Integer> pair : map1.entrySet()) {
                if (pair.getValue() >= k && pair.getKey() <= maxRow) {
                    arr[0] = pair.getKey();
                    arr[1] = m - map1.get(pair.getKey());
                    map1.put(pair.getKey(), map1.get(pair.getKey())-k);
                    k = 0;
                    break;
                }
                if (pair.getKey() >= maxRow) break;
            }
        }
        if (k == 0) return arr;
        else return new int[0];
    }

    public boolean scatter(int k, int maxRow) {
        long summa = 0;
        for (Map.Entry<Integer, Integer> summary:map1.entrySet()){
            if (summary.getKey()>maxRow || summa>=k) break;
            summa+=summary.getValue();
        }

        if (summa >= k) {
            for (Iterator<Map.Entry<Integer, Integer>> it = map1.entrySet().iterator(); it.hasNext();) {
                Map.Entry<Integer, Integer> entry=it.next();
                if (entry.getValue() >= k) {
                    map1.put(entry.getKey(), entry.getValue() - k);
                    k = 0;
                    if (map1.get(entry.getKey()) == 0) map1.remove(entry.getKey());
                }
                else {
                    k -= entry.getValue();
                    it.remove();
                }
                if (k == 0) break;
            }
        }
        if (k == 0) return true;
        else return false;
    }

    public static void main(String[] args) {

        //["BookMyShow","scatter","scatter","gather","scatter","gather","scatter","scatter","gather","gather","scatter","gather","gather","gather","scatter","scatter"]
        //[[18,48],[24,13],[12,5],[12,5],[3,12],[36,13],[25,6],[32,14],[29,6],[3,11],[30,0],[45,15],[23,17],[23,2],[41,10],[40,6]]

        BookMyShow obj = new BookMyShow(18,48);
        System.out.println(obj.map1 + "\n");

        boolean bool1 = obj.scatter(24,13);
        System.out.println(bool1);
        System.out.println(obj.map1 + "\n");

        boolean bool2 = obj.scatter(12,5);
        System.out.println(bool2);
        System.out.println(obj.map1 + "\n");

        int[] arr = obj.gather(12,5);
        if (arr.length == 2) System.out.println(arr[0] + "  " + arr[1]);
        else System.out.println(Arrays.toString(arr));
        System.out.println(obj.map1 + "\n");

        boolean bool3 = obj.scatter(3,12);
        System.out.println(bool3);
        System.out.println(obj.map1 + "\n");

        int[] arr8 = obj.gather(36,13);
        if (arr8.length == 2) System.out.println(arr8[0] + "  " + arr8[1]);
        else System.out.println(Arrays.toString(arr8));
        System.out.println(obj.map1 + "\n");

        boolean bool4 = obj.scatter(25,6);
        System.out.println(bool4);
        System.out.println(obj.map1 + "\n");

        boolean bool5 = obj.scatter(32,14);
        System.out.println(bool5);
        System.out.println(obj.map1 + "\n");

        int[] array = obj.gather(29,6);
        if (array.length == 2) System.out.println(array[0] + "  " + array[1]);
        else System.out.println(Arrays.toString(array));
        System.out.println(obj.map1 + "\n");

        int[] array1 = obj.gather(3,11);
        if (array1.length == 2) System.out.println(array1[0] + "  " + array1[1]);
        else System.out.println(Arrays.toString(array1));
        System.out.println(obj.map1 + "\n");

        boolean bool6 = obj.scatter(30,0);
        System.out.println(bool6);
        System.out.println(obj.map1 + "\n");

        int[] arr5 = obj.gather(45,15);
        if (arr5.length == 2) System.out.println(arr5[0] + "  " + arr5[1]);
        else System.out.println(Arrays.toString(arr5));
        System.out.println(obj.map1 + "\n");

        int[] arr6 = obj.gather(23,17);
        if (arr6.length == 2) System.out.println(arr6[0] + "  " + arr6[1]);
        else System.out.println(Arrays.toString(arr6));
        System.out.println(obj.map1 + "\n");

        int[] arr7 = obj.gather(23,2);
        if (arr7.length == 2) System.out.println(arr7[0] + "  " + arr7[1]);
        else System.out.println(Arrays.toString(arr7));
        System.out.println(obj.map1 + "\n");

        boolean bool7 = obj.scatter(41,10);
        System.out.println(bool7);
        System.out.println(obj.map1 + "\n");

        boolean bool8 = obj.scatter(40,6);
        System.out.println(bool8);
        System.out.println(obj.map1 + "\n");



    }
}

