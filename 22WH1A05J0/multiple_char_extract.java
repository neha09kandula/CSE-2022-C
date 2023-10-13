package string;

public class multiple_char_extract {
	public static void main(String args[])
	 {
		 String str="java strings platform";
		 char[] dst=new char [6];
		 str.getChars(6,11,dst,1);
		 System.out.println(dst);
		 
		 
		 
	 }
}
