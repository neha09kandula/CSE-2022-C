package javaprograms;

public class compare {
public compare() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s1 = "akshara";
     String s2 = "Shanku";
     String s3 = "Akshara";
     String s4 = "Sriram";
     System.out.println(s1.compareTo(s3));
     System.out.println(s2.compareTo(s4));
     System.out.println(s1.compareTo(s2));
     System.out.println(s1.compareToIgnoreCase(s3));
	}
} 