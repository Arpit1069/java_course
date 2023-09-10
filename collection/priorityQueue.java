package collection;

import java.util.*;

class Mycom implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2)
            return 1;
        if (o1 > o2)
            return -1;
        return 0;
    }
}

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        pq.forEach((x) -> System.out.println(x));
        
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(new Mycom());
        pq1.add(10);
        pq1.add(20);
        pq1.add(30);
        pq1.add(5);
        pq1.add(15);
        pq1.add(3);
        System.out.println(pq1);
        pq1.remove();
        System.out.println(pq1);
        pq1.forEach((x) -> System.out.println(x));
    }
}
