package le514;

public class Main {
public static void main(String args[])
{
int a,b;
try
{
    a=0;
	b=5/a;
	System.out.println("result");
}
catch(ArithmeticException e)
{
	System.out.println("DivideByZeroException");
}
finally
{
	System.out.println("execute finally block");
}
}}

