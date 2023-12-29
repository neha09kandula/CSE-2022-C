package cse225e3;

public class tryCatchFinally {

public static void main(String[] args) {
try
{
System.out.println ("Try Block");
int data = 125 / 5;
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
System.out.println ("rest of the code...");
}
}