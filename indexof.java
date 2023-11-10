package Java;

public class indexof {

	public static void main(String[] args) {
		String str="Hello Kitty!";
		System.out.println(str.indexOf("l"));
		System.out.println(str.indexOf("h"));  //element h is not present so it returns -1
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("t",1));
		System.out.println(str.indexOf("s",8));
		System.out.println(str.indexOf("t",2));

	}

}
