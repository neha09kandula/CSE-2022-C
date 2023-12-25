package programs;
import java.util.*;
public class Equality_4integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the 4 integers : ");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int d=in.nextInt();
		if(a==b && b==c && c==d)
			System.out.println("All numbers are equal ");
		else
			System.out.println("All numbers are not equal ");

		in.close();
	}

}
