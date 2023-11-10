package udemyexcercise;
import java.util.*;
public class sum_of_divisers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number you want to find the sum of divisers");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println("\n");
		int sum=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
