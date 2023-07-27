package method;

public class challenge3 {

    static int max(int... A) {
        if (A.length == 0)
            return Integer.MIN_VALUE;
        int max = A[0];
        for (int i = 1; i < A.length; i++)
            if (A[i] > max)
                max = A[i];

        return max;

    }

    static int sum(int... A) {
        int s = 0;
        for (int i = 0; i < A.length; i++)
            s += A[i];

        return s;
    }

    static double discount(double... x) {
        double discount;
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum = x[i] + sum;
        }
        if (sum >= 2000) {
            discount = sum * 0.2d;
            return discount;
        } else if (2000 > sum && sum >= 1000) {
            discount = sum * 0.15d;
            return discount;
        } else {
            discount = sum * 0.1d;
            return discount;
        }
    }

    public static void main(String[] args) {
        System.out.println(discount(new double[] { 100, 1500, 400, 300 }));

    }
}
