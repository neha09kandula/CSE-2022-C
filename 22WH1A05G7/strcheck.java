package javaprograms225g7;

public class strcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Vasudha";
		String s1="VASUDHA";
		String s2="Vasudha";
		char ch=s.charAt(5);
		System.out.println(ch);
		System.out.println(s.indexOf("s"));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareTo(s2));
		String name="java strings";
		char[] dst= new char [6];
		name.getChars(5, 9, dst, 0);
		System.out.println(dst);
	}

}
