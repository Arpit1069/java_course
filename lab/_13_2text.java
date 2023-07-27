package lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class _13_2text {
    public static void main(String[] args) {
        try {
            File file = new File("lab/text.txt"); // Replace with the actual path to your text file
            Scanner scanner = new Scanner(file);
            
            int wordCount = 0;
            
            while (scanner.hasNext()) {
                scanner.next();
                wordCount++;
            }
            
            System.out.println("Number of words in the file: " + wordCount);
            
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
