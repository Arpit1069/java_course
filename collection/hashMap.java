package collection;

import java.util.*;


public class hashMap {
       public static void main(String[] args) {
        HashMap<String, Integer> tm = new HashMap(Map.of("password", 1010, "name", 1111));
        tm.put("heloooo",1234);
        System.out.println(tm);
        System.out.println(tm.get("password"));
       }

}
