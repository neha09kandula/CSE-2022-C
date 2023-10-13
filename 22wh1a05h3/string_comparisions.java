package javaprogram5h3;

public class string_comparisions {

	public static void main(String[] args) {
String s1 = "hello world";
String s2 = "JYOTHIRMAI";
//implementation of equals()
System.out.println(s1.equals(s2));
//implementation of equalsIgnoreCase()
System.out.println(s1.equalsIgnoreCase(s2));
//implementation of compareTo()
System.out.println(s1.compareTo(s2));
//implementation of regionMatches()
System.out.println(s1.regionMatches (2, s2, 0, 4));
//implementation of concatenation
System.out.println(s1.concat(s2));
System.out.println(s1+""+s2);
//implementation of charAt()	
System.out.println(s1.charAt(4));
//implementation of indexOf()
System.out.println(s1.indexOf(4));
//implementation of getChars()
char[] dst =new char[6];
s1.getChars(6, 10, dst, 0);
System.out.println(dst);
// implementation of charArray()
//System.out.println(s1.charArray());
	}
}
