package javaprogram;

public class compare {

	public static void main(String[] args) {
	
	String s1 = "Sai";
	String s2 = "Harshi";
	String s3 = "sai";
	String s4 = "harshi";
	System.out.println(s1.compareTo(s3));
	System.out.println(s2.compareTo(s4));
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compareToIgnoreCase(s3));
	
	}

}
