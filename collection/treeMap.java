package collection;

import java.util.*;
import java.util.Map.Entry;

public class treeMap {
    public static void main(String[] args) {

        TreeMap<String, Integer> tm = new TreeMap(Map.of("password", 1010, "name", 1111));
        tm.put("heloooo",1234);
        System.out.println(tm);
        System.out.println(tm.ceilingKey("helo"));
        System.out.println(tm.ceilingEntry("helo").getValue());
        System.out.println(tm.get("password"));

        Entry<String,Integer> e = tm.firstEntry();
        System.out.println(e.getKey()+" "+e.getValue());
    }
}
