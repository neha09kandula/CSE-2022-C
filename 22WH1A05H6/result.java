package javapractice;
import java.util.*;

public class result {

	public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);
	   System.out.println("Enter the marks of the student:");
	   int marks=input.nextInt();
	   if (marks>85)
	   {
		   System.out.println("student secured first class");
	   }
	   else if(marks>=70 && marks<=80)
	   {
		   System.out.println("student secured second class");
	   }
	   else if(marks>35 && marks<=70)
	   {
		   System.out.println("student secured third class");
	   }
	   else
	   {
		   System.out.println("student failed");
	   }
input.close();
	}

}
