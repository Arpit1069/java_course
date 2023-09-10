package collection;
import java.util.*;

public class arrayDeque{
    public static void main(String[] args) {
         
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(10);
        dq.offerFirst(20);
        dq.offerLast(30);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        
    }
    
}