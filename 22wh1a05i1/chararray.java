package csec_22;

public class chararray {
	public static void main(String[] args) {
		String x="pragna";
		char[] a=x.toCharArray();
		System.out.println(a);
		String y="hi";
		System.out.println(x.equals(y))	;
		String z ="hello";
		System.out.println(x.equalsIgnoreCase(z));
		
		System.out.println(x.compareTo(z));
		String t="hello ramante";
		System.out.println(z.compareTo(t));
		System.out.println(z.compareTo(x));
		String a1="ABC";
		String a2="abc";
		System.out.println(a2.compareTo(a1));
}
}