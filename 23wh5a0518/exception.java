package frames;
public class exception {
public static void main(String[] args) {
int val1, val2;
try {
System.out.println("Start");
val1 = 0;
val2 = 25 / val1;
System.out.println(val2);
System.out.println("End");
}
catch (ArithmeticException e) {
System.out.println("Divide by Zero!!");
}
System.out.println("Rest of the code.");
}
}