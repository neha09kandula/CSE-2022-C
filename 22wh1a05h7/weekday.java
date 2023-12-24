package programs;
import java.util.*;
public class weekday {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number from 1 to 7 ");
		int n=in.nextInt();
		if(n==1)
			System.out.print("Sunday!!");
		else if(n==2)
			System.out.print("Monday!!");
		else if(n==3)
			System.out.print("Tuesday!!");
		else if(n==4)
			System.out.print("Wednesday!!");
		else if(n==5)
			System.out.print("Thursday!!");
		else if(n==6)
			System.out.print("Friday!!");
		else
			System.out.print("Saturday!!");
		in.close();		
	}

}
