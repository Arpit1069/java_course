package generics;

public class genericsdemo<T> {
    T data[]= (T[]) new Object[3];
    public static void main(String[] args) {
        genericsdemo<String> gd = new genericsdemo<String>();
        gd.data[0]="Arpit";
        gd.data[1] = "Sudhir";
        gd.data[2]= "Vidhale";
        for(int i = 0;i<3;i++){
            System.out.println(gd.data[i]);
        } 
    }
}
