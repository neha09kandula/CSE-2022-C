package mathproblem;

import java.util.Scanner;

class checkinggreater

{

	public void greater(int a,int b,int c)

	{

		if(a>b && a>c)

		{

			System.out.println("greater num is");

			System.out.println(a);

		}

		else if(b>a && b>c)

		{

			System.out.println("greater num is");

			System.out.println(b);

		}

		else

		{

			System.out.println("greater num  is 3");

			System.out.println(c);

		}

	}

}



public class Greater {



	public static void main(String[] args) {

		

		Scanner sc=new Scanner(System.in);

		System.out.println("entre a");

		int a=sc.nextInt();

		System.out.println("entre b");

		int b=sc.nextInt();

		System.out.println("entre c");

		int c=sc.nextInt();

		checkinggreater r=new checkinggreater();

		r.greater(a,b,c);

	



	}



}

