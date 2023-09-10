package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5);

        lhm.put(12, "A");
        lhm.put(17, "B");
        lhm.put(14, "C");
        lhm.put(24, "D");
        lhm.put(28, "E");
        System.out.println(lhm);
        LinkedHashMap<Integer, String> lh = new LinkedHashMap<>(5, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry e) {
                return size() > 5;
            }
        };

        lh.put(1, "A");
        lh.put(2, "B");
        lh.put(3, "C");
        lh.put(4, "D");
        lh.put(5, "E");

        System.out.println(lh);

        String s = lh.get(2);
        s = lh.get(5);
        s = lh.get(1);
        lh.put(6, "f");
        System.out.println(lh);

    }
}
