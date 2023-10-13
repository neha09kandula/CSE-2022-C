package javaprograms;


public class stringOPs {

	public static void main(String[] args) {
		String str = "Hello";
		String str1 = new String("World");
		System.out.print(str);
		System.out.print(str1);
		String str3 = "Welcome to geeks for geeks!";
		String str4 = "geeks";
		System.out.println("\n"+str3.indexOf("g"));
		System.out.println(str3.indexOf("g",12));
		System.out.println(str3.indexOf(str4));
		System.out.println(str3.indexOf(str4,12));
		System.out.println(str3.charAt(11));
		
		
		

	}

}
