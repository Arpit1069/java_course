package staticvsfinal;

public class singleton {
 public static void main(String[] args) {
    coffeeMac coffee = coffeeMac.getInstance();
 }    
}

class coffeeMac{
    private float cqty;
    private float wqty;
    static private coffeeMac our = null;
    private coffeeMac(){
        cqty =1;
        wqty =1;
    }
    static  coffeeMac getInstance(){
        if(our == null){
            our = new coffeeMac();
        }
        return our;
    }
}
