package test.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearn {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");

        System.out.println(map);

        map.put(3, "Другое значение для ключа три");

        System.out.println(map);
        System.out.println(map.get(1));

        for (Map.Entry<Integer, String> x : map.entrySet()){
            System.out.println(x.getKey() + " : " +x.getValue());
        }
    }
}
