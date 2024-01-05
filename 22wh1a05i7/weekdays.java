package Javaprogram;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number between 1 to 7");
		int n=input.nextInt();
		{
			if(n==1)
			{
				System.out.println("sunday");
			}
			else if(n==2)
			{
				System.out.println("monday");
			}
			else if(n==3)
			{
				System.out.println("tuesday");
			}
			else if(n==4)
			{
				System.out.println("wednesday");
			}
			else if(n==5)
			{
				System.out.println("thursday");
			}
			else if(n==6)
			{
				System.out.println("friday");
			}
			else
			{
				System.out.println("saturday");
			}
		}

	}

}
