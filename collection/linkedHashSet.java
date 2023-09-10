package collection;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashSet {
    
 public static void main(String[] args) 
    {
        HashSet<String> hs=new HashSet<>(10);
        
        hs.add("A");
        hs.add("C");
        hs.add("E");
        hs.add("K");
        hs.add("B");
        hs.add("G");
        hs.add("B");
        
        Iterator<String> itr=hs.iterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        LinkedHashSet<String> lhs=new LinkedHashSet<>(10);
        
        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("K");
        lhs.add("B");
        lhs.add("G");
        lhs.add("B");
        System.out.println(lhs);
    }   
}
