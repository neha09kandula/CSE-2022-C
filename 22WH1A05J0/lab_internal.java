package priyanka;

import java.util.Scanner;

/*9. (a)Write a java program to check whether entered number is palindrome number or not.
Sample : input = 363, output = palindrome
*/
public class lab_internal {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		input.close();
		int temp=num;
		int sum=0;
		int rev=0;
		while(num!=0)
		{
			rev=num%10;
			sum=sum*10+rev;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not Pallindrome");
		}
}
}
