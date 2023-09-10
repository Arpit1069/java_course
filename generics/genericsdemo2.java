package generics;

public class genericsdemo2 {
    public static void main(String[] args) {
        data<Integer> d1= new data<>() ;
        d1.setData(10);
        System.out.println(d1.getData());
        data<String> d2 = new data();
        d2.setData("Arpit Vidhale");
        System.out.println(d2.getData());
    }
}

class data<T>
{
    T obj ;
    public void  setData(T v){
        obj =v;
    }
    public T getData(){
        return obj;
    }
}