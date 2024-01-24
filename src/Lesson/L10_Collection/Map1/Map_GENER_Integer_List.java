package Lesson.L10_Collection.Map1;

import java.util.*;

public class Map_GENER_Integer_List {
    public static void main(String[] args) {
        int [] arr={2,4,1,2,5};
        int [] ind={0,1,2,3,4};
        int k=3;

        Map<Integer, List<Integer>> map=new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer>list=map.getOrDefault(arr[i], new ArrayList<Integer>());
            list.add(i);
            map.put(arr[i], list);
        }
        System.out.println(map);

        int []result=new int[k];
        int index=0;

        M1: for (List<Integer> i:map.values()){
            for (int j:i){
                result[index++]=j;
                if (index==k) break M1;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
