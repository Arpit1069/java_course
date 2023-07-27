package method;

public class objectpassing {
    static void update (int a[],int index,int value){
        a[index] = value;
    }
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5};
        update(a, 0, 7);
        for( int x :a){
            System.out.println(x);
        }
        
    }
}
