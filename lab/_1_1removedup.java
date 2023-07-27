package lab;
import java.util.Arrays;
import java.util.HashSet;

public class _1_1removedup {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 2, 3, 5, 6, 4 };
        
        System.out.println("Original array: " + Arrays.toString(array));
        
        int[] result = removeDuplicates(array);
        
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
    
    public static int[] removeDuplicates(int[] array) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        
        for (int element : array) {
            uniqueElements.add(element);
        }
        
        int[] result = new int[uniqueElements.size()];
        int index = 0;
        
        for (int element : uniqueElements) {
            result[index] = element;
            index++;
        }
        
        return result;
    }
}
