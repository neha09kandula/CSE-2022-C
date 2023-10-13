package java_programme5ii3;

public class strings 
	{
		public static void main(String[] args)
		{
			String name="be happy make others happy";
			char[] c=name.toCharArray();
			System.out.println(c);
			//System.out.println(name.getChars(1,2,name,0));
			char[] b=new char[2];
			name.getChars(0, 1, b, 0);
			System.out.println(b);
			
			
			
		}
	}


