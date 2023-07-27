package loop;

public class forloop {
    public static void main(String[] args) {
        //for(int i=0;i<=10;i++)
        //for(int i=0;i>0;i--)
        
        //int i=0;
        //for(System.out.println("Hi");i<=10;i++)
        //for(;;) infinite loop 
        
        for(int i=0,j=1;i<=10;i++,j=j*2)
        {
            System.out.println(i +" "+j);
        }
    }
}
