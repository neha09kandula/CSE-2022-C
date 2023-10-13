package javaprograms;

public class string {

	public static void main(String[] args) {

		
		String s1="nikitha";
		String s2="nikitha muppavaram";
		String s3="nikitha";
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.indexOf("i"));
		System.out.println(s1.charAt(3));
		System.out.println(s1.toCharArray());
		char[] ar=new char[100];
		s2.getChars(05,11,ar,0);
		System.out.println(ar);
	}
}