package programs;
import java.util.*;
public class Greatestof3numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the values of 3 numbers : ");
		n1=input.nextInt();
		n2=input.nextInt();
		n3=input.nextInt();
		if(n1>=n2 && n1>=n3)
			System.out.print("The largest of the given numbers is : "+n1);
		else if(n2>=n1 && n2>=n3)
			System.out.print("The largest of the given numbers is : "+n2);
		else
			System.out.print("The largest of the given numbers is : "+n3);
		input.close();
		}
}
