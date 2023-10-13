package Javaprograms;

public class compare {
	
	public compare() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s1 = "srujana";
     String s2 = "Vaishnavi";
     String s3 = "Srujana";
     String s4 = " vaishu";
     System.out.println(s1.compareTo(s3));
     System.out.println(s2.compareTo(s4));
     System.out.println(s1.compareTo(s2));
     System.out.println(s1.compareToIgnoreCase(s3));
	}

}
