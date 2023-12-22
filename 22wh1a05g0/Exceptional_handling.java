package csec_5g0;

public class Exceptional_handling{
static void validate(int age){
if(age<18)
throw new ArithmeticException("not valid");
else
System.out.println("welcome to vote");
}
public static void main(String args[]){
validate(13);
System.out.println("rest of the code...");
} }