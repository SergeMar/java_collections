package test.linkedHashMap_treeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(43, "Bob");
        map.put(32, "Nick");
        map.put(55, "Mike");
        map.put(0, "Sam");
        map.put(150, "Bob");

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
        System.out.print("\n");
    }
}
