import java.util.Scanner;
public class pattern {
public static void main(String args[])
{
	int s;
	int i,j;
	Scanner pat= new Scanner(System.in);
	System.out.println("enter a number!");
	s=pat.nextInt();
 
	for(i=0; i<s; i++)   
{
	for(j=0; j<=i; j++)   
{
System.out.print("* ");   
}
System.out.println();   
}  
}  
} 