package lab;
import java.util.HashMap;
import java.util.Scanner;

public class _16countwords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter String: ");
        String input = scanner.nextLine();
        
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        String[] words = input.split(" ");
        
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
        System.out.println(wordCountMap);
    }
}
