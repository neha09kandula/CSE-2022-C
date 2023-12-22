package internal;

public class Exception2 {
	public static void main(String[] args) {
		try {
			String a=null;
			System.out.println(a.charAt(0));
		}
		catch(NullPointerException a) {
			System.out.println(a);
		}
	}
}
