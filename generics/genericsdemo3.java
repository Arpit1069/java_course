package generics;

public class genericsdemo3 {
    public static void main(String[] args) {
        MyArray<Integer> ma = new MyArray<>();
        ma.append(10);
        ma.append(20);
        ma.display();

    }
}

class MyArray<T> {
    T A[] = (T[]) new Object[10];
    private int length = 0;

    public void append(T v) {
        A[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }
}
