package collection;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(10, 0.5f);
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);
        System.out.println(hs);
    }
}
