package cseb;
import java.util.*;
public class greatest {
	public static void main(String[]  args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a value:");
		int a=scan.nextInt();
	System.out.println("enter b value:");
		int b=scan.nextInt();
		System.out.println("enter c value:");
		int c=scan.nextInt();
		if(a>b&&a>c){
		System.out.println(a);
	
		}
		else if(b>c)
		{
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}

}
