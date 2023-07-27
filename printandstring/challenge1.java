package printandstring;


public class challenge1 {
    public static void main(String[] args) {
        String str = "programmer@gmail.com";
        if (str.matches(".*gmail.*")) {
            System.out.println("given email is valid");
            System.out.println("Username: ");
            int i = str.indexOf('@', 0);
            System.out.println(str.substring(0, i));
            System.out.println("Domain Name :");
            System.out.println(str.substring(i + 1));
        } else {
            System.out.println("Invalid email");
        }
    }
}
