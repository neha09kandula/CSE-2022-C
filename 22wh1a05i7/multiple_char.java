package java_5i7;

public class multiple_char {
	public static void main(String args[])
	{
		String str ="siri";
		char[]dst=new char[6];
		str.getChars(3, 4, dst, 0);
		System.out.println(dst);
	}

}
