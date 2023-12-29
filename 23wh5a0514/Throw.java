package le514;

public class Throw {
static void checkMarks(int marks) {
	if(marks>100)
	{
		throw new ArithmeticException("not eligible");
	}
	else
	{
		System.out.println("eligible");
	}
}
public static void main(String args[]) 
{
	checkMarks(99);
	
}
}
