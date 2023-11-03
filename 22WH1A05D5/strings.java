package frames;

public class strings {
	public static void main(String[] args) {
		String str="Hello";
		String str1="hello";
		String str2="anjali";
		String str3="Anjali";
		String str4="bunny";
		char[] charArray= new char[10];
	str2.getChars(2,6,charArray,0);
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str1.compareTo(str3));
		System.out.println(str3.compareTo(str4));
		System.out.println(str2.compareTo(str3));
		System.out.println(str.indexOf("l"));
		System.out.println(str.concat(str2));
		System.out.println(str.charAt(3));
		System.out.println(charArray);
	}
	
}
	