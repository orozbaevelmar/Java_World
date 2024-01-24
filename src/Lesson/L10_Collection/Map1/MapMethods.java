package Lesson.L10_Collection.Map1;

// Элементами HashMap явлются пары ключ/значение. HashMap не запоминает порядок добавления элементов. Его методы работают очень быстро.
// Ключи элементов должны быть уникальными. Ключ может быть null. Значения элементов могут повторятся. Значения могут быть null.

// put
// putIfAbsent
// get(key)
// remove(key)
// containsValue(value)
// containsKey(key)
// keySet() ---> return keys
// values() ---> return values
// entrySet()

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4, "D");
        map.putIfAbsent(1, "ABCD");
        map.putIfAbsent(7, "A");
        System.out.println(map);
        System.out.println("------------------");
        map.remove(4);
        map.remove(3,"C");
        System.out.println(map);
        System.out.println("------------------");
        System.out.println(map.get(2));;
        System.out.println("------------------");
        System.out.println(map.containsValue("B"));
        System.out.println("------------------");
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println("------------------");

        Map<Integer, String> map5 = new HashMap<>();
        map5.put(1, "a");
        map5.put(2, "b");
        map5.put(3, "c");
        for (Map.Entry<Integer, String> entry : map5.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("----------------------");
        System.out.println("----------------------");
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();
        testMap(hashMap);
        System.out.println("----------------------");
        testMap(linkedHashMap);
        System.out.println("----------------------");
        testMap(treeMap);

    }

    public static void testMap(Map<Integer, String> map) {
        map.put(34, "Bob");
        map.put(0, "Asa");
        map.put(3, "Koka");
        map.put(234, "Men");
        map.put(32, "Bish");
        map.put(55, "Osh");
        map.put(2, "Naryn");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
