package cse225f9;

public class Getchar {

	public Getchar() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="pakkaa";
		char[] ch=new char [8];
		s1.getChars(1, 5, ch, 0);
		System.out.println(ch);

	}

}
