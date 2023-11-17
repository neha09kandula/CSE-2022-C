package csec;

public class strings2 {

	public static void main(String[] args) {
           String s1="charanya";
           String s2="charanya arvapalli";
           String s3="charanya";
           char[] name=new char[6];
           System.out.println(s1.compareTo(s2));
           System.out.println(s2.compareTo(s3));
           System.out.println(s1.compareTo(s3));
           s1.getChars(1,7,name,0);
           System.out.println(name);
           System.out.println(s1.indexOf(6));
           System.out.println(s1.charAt(3));
           System.out.println(s1.toCharArray());
           
	}

}