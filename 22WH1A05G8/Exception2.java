package programs;
import java.util.*;

public class Exception2 {
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	void method () throws ArithmeticException{
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		if(c>=0) {
			System.out.println("Area="+c);
		}
		else
		{
			throw new ArithmeticException("Mis match input");
		}
	}
}