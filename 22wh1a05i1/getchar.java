package csec_22;

public class getchar {

	public static void main(String[] args) {
		String name = "hello";
		char[] dst = new char[5];
		name.getChars(2,4,dst, 0);
		System.out.println(dst);

	}

}
