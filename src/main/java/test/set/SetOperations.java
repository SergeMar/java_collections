package test.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();

        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();

        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        // union - объединение
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println(union);

        //intersection - пересечение
        Set<Integer> interection = new HashSet<>(set1);
        interection.retainAll(set2);

        System.out.println(interection);

        //difference - разность
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        System.out.println(difference);
    }
}
