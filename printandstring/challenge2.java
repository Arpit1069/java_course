package printandstring;

public class challenge2 {
    public static void main(String[] args) {
        int b = 100110010;
        String str1 = String.valueOf(b);
        System.out.println(str1.matches("[01]+"));

        // Counting words in a String
        String str = "      abc     def     gh   ijk    ";
        str = str.replaceAll("\\s+", " ").trim();
        String words[] = str.split("\\s");
        System.out.println(words.length);

        String str2 = "a!B@c#1$2%3";
        str2 = str2.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str2);

    }
}
