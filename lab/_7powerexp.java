package lab;

class MyCalculator extends Exception{
    public long power(int n, int p) throws Exception {
        long result = 1;
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero");
        } else {
            for (int i = p; i > 0; i--) {
                result = result * n;
            }
            return (long) result;
        }
    }
}

public class _7powerexp {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();

        try {
            long result1 = calculator.power(2, 4);
            System.out.println("Result 1: " + result1);

            long result2 = calculator.power(0, 0); // Throws exception
            System.out.println("Result 2: " + result2);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
