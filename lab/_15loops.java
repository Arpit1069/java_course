package lab;
import java.util.ArrayList;
import java.util.Iterator;

public class  _15loops  {
    public static void main(String[] args) {
      
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        
        System.out.println("Iterator Loop:");
        iterateUsingIterator(numbers);
        
        System.out.println("Advanced For Loop:");
        iterateUsingEnhancedForLoop(numbers);
        
        System.out.println("For Loop:");
        iterateUsingForLoop(numbers);
    }
    public static void iterateUsingIterator(ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
        }
        System.out.println();
    }

    public static void iterateUsingEnhancedForLoop(ArrayList<Integer> list) {
        for (int number : list) {
            System.out.println(number);
        }
        System.out.println();
    }
   
    public static void iterateUsingForLoop(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            System.out.println(number);
        }
        System.out.println();
    }
}
