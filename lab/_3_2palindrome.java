package lab;

public class _3_2palindrome {
    public static void main(String[] args) {
        String inputString = "madam";
        
        System.out.println("Input String: " + inputString);
        
        boolean isPalindrome = checkPalindrome(inputString);
        
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    
    public static boolean checkPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
