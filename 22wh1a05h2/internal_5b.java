package javaprograms;
import java.util.*;
public class week {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number from 1 to 7 ");
		int x=in.nextInt();
		if(x==1)
			System.out.print("Sunday");
		else if(x==2)
			System.out.print("Monday");
		else if(x==3)
			System.out.print("Tuesday");
		else if(x==4)
			System.out.print("Wednesday");
		else if(x==5)
			System.out.print("Thursday");
		else if(x==6)
			System.out.print("Friday");
		else
			System.out.print("Saturday");
		in.close();		
	}

}
