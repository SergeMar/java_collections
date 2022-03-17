package test.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        addName(hashSet);
        addName(linkedHashSet);
        addName(treeSet);

        setName(hashSet);
        setName(linkedHashSet);
        setName(treeSet);

        System.out.println(hashSet.contains("Bob"));
        System.out.println(hashSet.contains("Tom"));
    }

    private static void setName(Set<String> set) {
        for (String name : set) {
            System.out.println(name);
        }
        System.out.println();
    }

    private static void addName(Set<String> set) {
        set.add("Nick");
        set.add("Mike");
        set.add("Bob");
        set.add("Bill");
        set.add("John");
    }
}
