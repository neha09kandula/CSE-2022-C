package javaprograms;

public class getchars {

	public static void main(String[] args) {
     String name="java strings";
     char[] dst=new char[6];
     name.getChars(4,9,dst,0);
     char ch=name.charAt(5);
     System.out.println(dst);
     System.out.println(ch);
	}

}
