package generics;

public class genericmtd {
    static <E> void show(E[] list){
        for(E x:list){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        show(new String[]{"hi","go","bye"});
        show(new Integer[]{10,20,30});

    }
}

 
