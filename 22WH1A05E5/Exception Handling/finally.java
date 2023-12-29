package Java;

public class Exception {

public static void main(String[] args) {
	try{
		System.out.println ("Try Block");
		int data = 138 / 5;
		System.out.println ("Result:" + data);
}
catch (NullPointerException e) {
		System.out.println ("Catch Block");
		System.out.println (e);
}
finally {
	System.out.println ("FinallyBlock");
	System.out.println ("No Exception:finally block executed");
}
}
}
