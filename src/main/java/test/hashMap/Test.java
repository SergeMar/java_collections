package test.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.util.Objects.hash;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Bob", 25);
        map.put("Katy", 15);
        map.put("Bill", 40);

        Set<String> set = new HashSet<>();
        System.out.println(hash("Bob")&15);
    }
}
