package Frame;
import java.util.Scanner;
public class greatest_number 
{
    public static void main(String args [])
    {
        int a,b,c;
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter three numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
		}
        
        if(a>b && a>c)
        {
            System.out.println(" greater number is a");
        }
        else if(b>a && b>c)
        {
            System.out.println(" greater number is b");  
        }
        else
        {
            System.out.println(" greater number is c");
        }
        
    }

}