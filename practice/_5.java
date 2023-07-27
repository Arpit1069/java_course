package practice;
abstract class Percentage1{
    public abstract void per(); 
}
class a extends Percentage1{
    int sub1;
    int sub2;
    int sub3;
public a(int sub1,int sub2,int sub3){
    this.sub1 = sub1;
    this.sub2 = sub2;
    this.sub3 = sub3;
}
@Override
public void per() {
    double result = (sub1+ sub2+sub3)/3;
    System.out.println(result);
}
}
class b extends Percentage1{
    int sub1;
    int sub2;
    int sub3;
    int sub4;
 b(int sub1,int sub2,int sub3,int sub4){
    this.sub1 = sub1;
    this.sub2 = sub2;
    this.sub3 = sub3;
    this.sub4 = sub4;
}
@Override
public void per() {
    double result = (sub1+ sub2+sub3 +sub4)/4;
    System.out.println(result);
}
}
public class _5 {
   public static void main(String[] args) {
    Percentage1 a1 = new a(56,50,53);
    a1.per();
    Percentage1 b1 = new b(22,44,66,88);
    b1.per();
   } 
}
