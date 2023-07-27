package array;

import javax.xml.transform.Source;

public class challenge4 {
    public static void main(String[] args) {
        int A[][] = { { 3, 4, 5, 6 }, { 1, 2, 3, 4 }, { 1, 1, 1, 1 } };
        int B[][] = { { 1, 1, 1, 1 }, { 1, 2, 3, 4 }, { 3, 4, 5, 6 } };
        int C[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(C[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
