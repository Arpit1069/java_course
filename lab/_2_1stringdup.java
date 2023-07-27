package lab;
import java.util.HashMap;
import java.util.Map;
public class _2_1stringdup  {
    public static void main(String[] args) {
        String inputString = "Java is great. Python is also great. Java and Python are popular programming languages.";

        // Split the input string into words
        String[] words = inputString.split(" ");

        // Create a hashmap to store the word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Iterate over each word in the words array
        for (String word : words) {
            // If the word already exists in the hashmap, increment its count
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } 
            // Otherwise, add the word to the hashmap with a count of 1
            else {
                wordCountMap.put(word, 1);
            }
        }
        
        // Iterate over the hashmap and count the number of words with a count greater than 1
        int numDuplicates = 0;
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                numDuplicates++;
            }
        }

        System.out.println("Number of duplicate words: " + numDuplicates);
    }
}
