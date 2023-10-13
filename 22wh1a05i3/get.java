package java_programme5ii3;

public class get 
	{
		public static void main(String[] args)
		{
			
		String name="sanjana";
		char[] b=name.toCharArray();
		//System.out.println();
		System.out.println(b);
		char[] c=new char[8];
		name.getChars(1, 3, c, 0);
		System.out.println(c);

}
	}
