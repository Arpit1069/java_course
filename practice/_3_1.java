package practice;

import javax.sound.sampled.ReverbType;
import javax.xml.transform.stax.StAXResult;

public class _3_1 {
    public static void main(String[] args) {
        String str = "kaise ho app";
        String rev = reverse(str);
        System.out.println(rev); 
    }
    public static String reverse(String inp){
        StringBuilder st = new StringBuilder();
        for( int i= inp.length()-1;i>=0;i--){
            st.append(inp.charAt(i));
        }
        return st.toString();
        }


}
