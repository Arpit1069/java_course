package loop;

import java.util.Scanner;

public class challenge1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    int result=1;
    if(n!=1 || n!=0){
        for(int i =1;i<=n;i++)
    {
       result = result *i; 
    }
    }
    System.out.println(result);

     /* Sum of n Natural Numbers
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int n=sc.nextInt();
     
           int sum=0;
           
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        
        System.out.println("Sum of "+n+" Number is "+sum);
        
        
    }*/
    
    /* Display Multiplication Table
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+" = "+n*i);
        }
        
        
    }  */
  }  
}
