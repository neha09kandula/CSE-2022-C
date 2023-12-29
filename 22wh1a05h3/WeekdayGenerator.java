package labprograms;
import java.util.*;
public class WeekdayGenerator {
public static void main(String[]args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number between 1 nad 7");
	int num =scan.nextInt();
	if(num< 1 || num>7)
	{
		System.out.println("enter the correct number");
	}
	else if(num==1)
	{
		System.out.println("MONDAY");
	}
	else if(num==2)
	{
		System.out.println("TUESDAY");
	}
	else if(num==3)
	{
		System.out.println("WEDNESDAY");
	}
	else if(num==4)
	{
		System.out.println("THURSDAY");
	}
	else if(num==5)
	{
		System.out.println("FRIDAY");
	}
	else if(num==6)
	{
		System.out.println("SATURDAY");
	}
	else if(num==7)
	{
		System.out.println("SUNDAY");
	}
}
}
