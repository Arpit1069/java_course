package objectoriented;

class studentinfo{
    public int roll,m1,m2,m3;
    public String name,course;

    public double total(){
        return m1+m2+m3;
    }
    public double average(){
        return total()/3;
    }
    public void grade(){
        if(average()>70)
        System.out.println("A");
        else
        System.out.println("B");
    }
    public String toString()
    {
        return "Roll No:"+roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
    }
}
public class student {
    public static void main(String[] args) 
    {
        studentinfo s=new studentinfo();
        
        s.roll=1;
        s.name="John";
        s.course="CS";
        s.m1=70;
        s.m2=80;
        s.m3=65;
        
        System.out.println("Total :"+s.total());
        System.out.println("Average :"+s.average());
        
        System.out.println("Details:\n "+ s );
        
    }
}
