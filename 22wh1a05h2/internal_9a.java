package javaprograms;
import java.util.*;
public class Equality {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.print("Enter 4 integers : ");
		int p=in.nextInt();
		int q=in.nextInt();
		int r=in.nextInt();
		int s=in.nextInt();
		if(p==q && q==r && r==s)
			System.out.println("All the numbers are equal ");
		else
			System.out.println("All the numbers are not equal ");

		in.close();
	}

}
