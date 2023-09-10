package collection;

import java.util.*;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,30,50,70,10,40));
        ts.add(10);
        ts.add(30);
        System.out.println(ts.ceiling(55));
        System.out.println(ts);
    }
}
