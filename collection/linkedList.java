package collection;

import java.util.*;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.addFirst(100);
        System.out.println(ll); 
        ll.removeLast();
        System.out.println(ll); 
        System.out.println(ll.peek());
        ll.poll();
        System.out.println(ll); 
    }
}
