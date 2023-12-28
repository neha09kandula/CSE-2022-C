package priyanka;

import java.util.Scanner;

public class greater_num {

	public static void main(String args[])
	   {
		   Scanner input= new Scanner(System.in);
		   System.out.println("enter three numbers");
		   int N1=input.nextInt();
		   int N2=input.nextInt();
		   int N3=input.nextInt();
		   input.close();
		   if (N1 == N2 && N2 == N3) 
		   {
	            System.out.println("All three numbers are equal: " + N1);
		   }
		   else  if(N1>=N2 && N1>=N3)
		   {
			   System.out.println("the greatest number is :"+N1);
		   }
		   else if(N2>=N3)
		   {
			   System.out.println("the greatest number is :"+N2);
		   }
		   else
		   {
			   System.out.println("the greatest number is :"+N3);
		   }
		   
}
}
