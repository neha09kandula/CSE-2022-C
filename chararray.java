package Java;

public class chararray {
	public static void main(String args[])
	{
		
		//char->array
		String a="Hello welcome!";
		char[] c=a.toCharArray();
		System.out.println(c);

		
		//equals
		String b="Heyy!";
		System.out.println(a.equals(b));
		
		//equalsIgnorecase
		String d="hello welcome!";
		System.out.println(a.equalsIgnoreCase(d));
	
		
		
		//compareS LENGTHS OF THE 
		System.out.println(a.compareTo(d));
		String x="hello welcome!";
		System.out.println(d.compareTo(x));
		System.out.println(d.compareTo(a));
		
	
		String a1="Abc";
		String a2="ABCDE";
		System.out.println(a1.compareTo(a2));		
		
	}

}
