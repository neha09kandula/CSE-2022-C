package vvvvvv;

/*(b) Write a Java program that takes a number from the user and generates an integer
between 1 and 7. It displays the weekday name.*/
import java.util.Scanner;

public class week {

	public static void main(String args[])
	   {
		   Scanner input= new Scanner(System.in);
		   System.out.println("enter number between 1 and 7");
		   int N=input.nextInt();
		   input.close();
		   if(N==1)
		   {
			   System.out.println("monday");
		   }
		   else if(N==2)
		   {
			   System.out.println("tuesday");
		   }
		   else if(N==3)
		   {
			   System.out.println("wednesday");
		   }
		   
		   else if(N==4)
		   {
			   System.out.println("thursday");
		   }
		   else if(N==5)
		   {
			   System.out.println("friday");
		   }
		   
		   else if(N==6)
		   {
			   System.out.println("saturday");
		   }
		   
		   else if(N==7)
		   {
			   System.out.println("sunday");
		   }
		   else
		   {
			   System.out.println("please enter the number between 1 and 7 only!");
		   }
		   
		   
}
}
