package practice;

public class _13_1 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++){
            for(int j =0 ;j<3;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    
        int [][] arb = new int [3][3];
        for(int i=0;i<3;i++){
            for(int j =0 ;j<3;j++){
                arb[j][i] = arr[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j =0 ;j<3;j++){
                System.out.print(arb[i][j]+" ");

            }
            System.out.println();
        }
        
}
}
