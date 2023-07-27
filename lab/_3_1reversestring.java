package lab;

public class _3_1reversestring {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        
        System.out.println("Original String: " + inputString);
        
        String reversedString = reverseString(inputString);
        
        System.out.println("Reversed String: " + reversedString);
    }
    
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        
        return reversed.toString();
    }
}
