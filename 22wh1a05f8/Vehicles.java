package my_java_projects;

class Demo 
{
	void drive() 
	{
		System.out.println("Repairing a vehicle...");
	}
}

class car extends Demo
{
	void drive() 
	{
		System.out.println("Repairing a car...");
	}
}

public class Vehicles
{
	public static void main(String args[])
	{
		car obj = new car();
		obj.drive();
	}
}
