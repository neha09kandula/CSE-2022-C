package javaprogrames_5i6;

public class Strings3 
{
	public static void main(String args[])
	{
		String name = "Java Strings";
		char[] dst = new char [9];
		name.getChars(2, 7, dst, 0);
		System.out.println(dst);
		System.out.println(name.substring(1,4));
	}

}
