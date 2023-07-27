package lab;

class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    Adder() {
        System.out.println("My superclass is: Arithmetic");
    }
}

class _6superclass {
    public static void main(String[] args) {
        Adder adder = new Adder();

        int sum = adder.add(42, 13);
        System.out.println(sum);

        sum = adder.add(13, 20);
        System.out.println(sum);
    }
}
