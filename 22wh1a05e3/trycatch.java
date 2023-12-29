public class trycatch {
public static void main(String[] args) {
int val1, val2;
try {
System.out.println("Try Block has Started");
val1 = 0;
val2 = 77 / val1;
System.out.println(val2);
System.out.println("Try Block is Ended");
}
catch (ArithmeticException e) {
System.out.println("ArithmeticException:: Divide by Zero!!");
}
System.out.println("Outside try-catch::Rest of the code.");
}
}