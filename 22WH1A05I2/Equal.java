package internal5i2;
import java.util.*;

public class Equal {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st integer:");
		int n1=in.nextInt();
		System.out.println("Enter 2nd integer:");
		int n2=in.nextInt();
		System.out.println("Enter 3rd integer:");
		int n3=in.nextInt();
		System.out.println("Enter 4th integer:");
		int n4=in.nextInt();
		in.close();
		if(n1==n2 && n2==n3 && n3==n4)
		{
			System.out.println("equal");
			
		}
		else {
			System.out.println("not equal");
		}

	}

}



