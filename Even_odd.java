import java.util.Scanner;
public class Even_odd{
	 public static void main(String[] agrs){
		int x;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number to check:");
		x=input.nextInt();
		if(x%2==0){
			System.out.println("the number is even :");
		}
		else{
			System.out.println("the number is odd:");
		}
}
}