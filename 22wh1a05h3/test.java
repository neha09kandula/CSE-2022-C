package labprograms;
import java.util.*;
public class test {
public static void main(String[]args)
{
	car obj=new car();
	obj.drive();
}
}
class vehicle{
	void drive()
	{
		System.out.println("car is working");
	}
}
class car extends vehicle
{
	void drive()
	{
		System.out.println("car is under repair");
	}
}
