package Java;

public class getchar {
	
	public static void main(String args[])
	{
		String str="Calo";
		char[] s=new char[4];
		str.getChars(2,4, s, 0);
		System.out.println(s);

	}

}
