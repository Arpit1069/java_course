package practice;

import java.awt.desktop.AboutEvent;
import java.util.*;


public class _15 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(21);
        al.add(31);
        al.add(41);

        System.out.println("using iterator:");
        usee(al);
        usei(al);
        usef(al);

    }
    public static void usei(ArrayList<Integer> al){
        Iterator <Integer> it = al.iterator();
        while(it.hasNext()){
            int num = it.next();
            System.out.println(num);
        }
        System.out.println();
    }
    public static void usee(ArrayList<Integer> al){
        for( int a: al){
            System.out.println(a);
        }
    }
    public static void usef(ArrayList<Integer> al){
        for( int a =0 ; a<al.size();a++){
            System.out.println(al.get(a));
        }
    }
    
}
