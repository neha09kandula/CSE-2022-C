package frames;
public class exception2 {
static void checkAge(int age) {
if (age < 18) {
throw new ArithmeticException("You must be at least 18 years old.");
}
else {
System.out.println("Access granted - Youare old enough!");
}
}
public static void main(String[] args) {
checkAge(15); 
}
}