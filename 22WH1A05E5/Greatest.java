package swathi;
import java.util.*;
public class Greatest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1= input.nextInt();
		System.out.println("Enter the second number");
		int num2= input.nextInt();
		System.out.println("Enter the third number");
		int num3= input.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.printf("The greatest number is "+num1);
		}
		else if(num2>num1 && num2>num3){
			System.out.printf("The greatest number is "+num2);
		}
		else {
			System.out.printf("The greatest number is "+num3);
		}
		

	}

}
