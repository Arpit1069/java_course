package operatorandexpression;

public class masking {
   
   public static void main(String[] args) {
    byte a=9,b =12;
    byte c;
    System.out.println(Integer.toBinaryString(a)); 
    System.out.println(Integer.toBinaryString(b)); 
    c = (byte)(a<<4);
    c = (byte)(c|b);
    System.out.println(Integer.toBinaryString(c)); 
    System.out.println((c&0b11110000)>>4);
    System.out.println((c&0b00001111));
   } 
    
}


