package lab;
import java.util.Arrays;
import java.util.Scanner;

public class _17stringreverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read 10 strings from the console
        String[] strings = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a string: ");
            strings[i] = scanner.nextLine();
        }
        
        // Sort the strings
        Arrays.sort(strings);
        
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
        
        // Combine two strings
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();
        
        String combinedString = firstString +secondString;
        System.out.println("Combined string: " + combinedString);
        
        // Reverse the first string
        String reversedString = reverseString(firstString);
        System.out.println("Reversed first string: " + reversedString);
    }
    
    // Reverses a given string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
