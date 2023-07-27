package lab;
import java.util.ArrayList;
import java.util.Arrays;

public class _1_2commonelement {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 4, 5, 6, 7, 8 };
        
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        
        ArrayList<Integer> commonElements = findCommonElements(array1, array2);
        
        System.out.println("Common elements: " + commonElements);
    }
    
    public static ArrayList<Integer> findCommonElements(int[] array1, int[] array2) {
        ArrayList<Integer> commonElements = new ArrayList<>();
        
        for (int element : array1) {
            if (contains(array2, element)) {
                commonElements.add(element);
            }
        }
        
        return commonElements;
    }
    
    public static boolean contains(int[] array, int element) {
        for (int value : array) {
            if (value == element) {
                return true;
            }
        }
        return false;
    }
}
