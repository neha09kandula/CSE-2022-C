
class phone
{
    String a;
    String b;
    public void vib()
    {
        System.out.println("is vibrating");
    }
    public void ring()
    {
        System.out.println("is ringing");
    }
}
public class Main
    {
        public static void main(String[] args)
        {
            phone s=new phone();
            s.a="vibrating";
            s.vib();
            s.b="ringing";
            s.ring();
           
        }
        
        
        
    }
