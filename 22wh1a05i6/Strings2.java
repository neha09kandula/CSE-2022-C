package javaprogrames_5i6;

public class Strings2 
{
	public static void main(String args[])
	{
		String str = "Hello";
		char ch = str.charAt(0);
		System.out.println(ch);
		String s1 = "shynitha";
		String s2 = "SHYNITHA";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		String name1 = "Muralidhar";
		String name2 = "Muralidhar";
		String name3 = "Soumitha";
		System.out.println(name1.compareTo(name2));
		System.out.println(name1.compareTo(name3));
		System.out.println(name3.compareTo(name1));
		char result = s1.charAt(4);
		char result1 = s2.charAt(4);
		System.out.println(result);
		System.out.println(result1);
	}

}
