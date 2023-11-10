public class constructor
{
	constructor()
	{
		int a=6;
		int b=3;
		int c=a+b;
  		int d=a-b;
		int e=a*b;
		
	}
	public static void main(String args[])
	{
		constructor s = new constructor();
		System.out.println(s.c);
		System.out.println(s.d);
		System.out.println(s.e);
	}
}