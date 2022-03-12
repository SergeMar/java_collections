package test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLearn {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<10; i++){
            list.add(i);
        }
        System.out.println(list.get(5));
        System.out.println(list);
        System.out.println(list.size());

        for(int x:list){
            if (x!= list.size()-1){
            System.out.print(x + ", ");
            } else {
                System.out.println(x);
            }
        }
        list.remove(3);
        System.out.println(list);
    }
}
