package collection;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(20);
        ArrayList<Integer> list1 = new ArrayList<>(List.of(50, 60, 70));
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list.size());

        System.out.println(list);

        System.out.println(list1.size());
        System.out.println(list1);

        list.addAll(list1);

        System.out.println(list.size());
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        System.out.println(list.contains(50));

        System.out.println(list.containsAll(list1));

        System.out.println(list.equals(list1));

        list.set(0, 10);
        System.out.println(list);
        System.out.println(list.get(0));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
        for (Integer x : list) {
            System.out.print(x);
        }
        System.out.println();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
        System.out.println();
        ListIterator<Integer> lit = list.listIterator();
        while(lit.hasNext()){
            System.out.println(lit.next());
        }

        list.forEach(n->System.out.println(n) );
    }
}
