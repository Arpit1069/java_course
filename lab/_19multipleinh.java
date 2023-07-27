package lab;

interface Account1 {
    void set(String name, int accountNumber, double balance);
    void display();
}

interface Person1 {
    void store();
    void disp();
}

class Customer1 implements Account1, Person1 {
    private String name;
    private int accountNumber;
    private double balance;
    
    public void set(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void display() {
        System.out.println("Account Information");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest: $" + calculateInterest());
    }
    
    public void store() {
        System.out.println("Storing person information");
        // Additional implementation for storing person information
    }
    
    public void disp() {
        System.out.println("Displaying person information");
        // Additional implementation for displaying person information
    }
    
    private double calculateInterest() {
        // Calculate and return interest
        return balance * 0.05; // Assuming interest rate of 5%
    }
}

public class _19multipleinh {
    public static void main(String[] args) {
        Customer1 customer = new Customer1();
        
        // Accepting customer details
        customer.set("John Doe", 123456789, 5000.0);
        
        // Displaying account information
        customer.display();
        
        // Calling person methods
        customer.store();
        customer.disp();
    }
}

