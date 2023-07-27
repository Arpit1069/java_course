package practice;

public class _3_2 {
   public static void main(String[] args) {
    String str ="mama";
    boolean che = check(str);
    if(che){
        System.out.println("palindrome");
    }
    else{
        System.out.println("not");
    }
   } 
   public static boolean check(String str){
    int left = 0, right = str.length()-1;
    while(left<right){
        if(str.charAt(right) == str.charAt(left)){
            return true;
        }
        left++;
        right--;
    }
    return false;
   }
}

