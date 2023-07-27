package lab;
import java.util.HashMap;
import java.util.Scanner;

public class _8Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of entries
        int numEntries = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        // Create a HashMap to store the phone book entries
        HashMap<String, String> phoneBook = new HashMap<>();

        // Read the entries and populate the phone book
        for (int i = 0; i < numEntries; i++) {
            String name = scanner.nextLine();
            String phoneNumber = scanner.nextLine();

            // Check if the name contains only lowercase alphabets
            if (!name.matches("[a-z]+" )) {
                System.out.println("Invalid name format: Only lowercase alphabets are allowed.");
                continue;
            }

            // Check if the phone number contains up to 8 digits
            if (!phoneNumber.matches("\\d{1,8}")) {
                System.out.println("Invalid phone number format: Phone number should contain up to 8 digits.");
                continue;
            }

            phoneBook.put(name, phoneNumber);
        }

        // Process the queries until end-of-file
        while (scanner.hasNextLine()) {
            String query = scanner.nextLine();

            // Check if the query contains only lowercase alphabets
            if (!query.matches("[a-z]+")) {
                System.out.println("Invalid query format: Only lowercase alphabets are allowed.");
                continue;
            }

            // Check if the query exists in the phone book
            if (phoneBook.containsKey(query)) {
                String phoneNumber = phoneBook.get(query);
                System.out.println(phoneNumber);
            } else {
                System.out.println("Not found");
            }
        }

        scanner.close();
    }
}
