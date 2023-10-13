package javaprograms22wh1a05g8;

public class methods {

	public static void main(String[] args) {
		String s="Ayesha Banu";
		String s1="AYESHA BANU";
		char ch=s.charAt(5);
		System.out.println(ch);
		int d=s.indexOf("s");
		System.out.println(d);
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.compareTo(s1));
		System.out.println(s1.compareTo(s));
		char[] r=new char[6];
		s.getChars(4,9,r,0);
		System.out.println(r);
		StringBuffer o =new StringBuffer(s);
		System.out.println(o);
	}
}