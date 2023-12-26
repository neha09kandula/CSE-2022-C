package vechilerepair;

class vechile

{

	public void drive()

	{

		System.out.println("repairing");

	}

}

class car extends vechile

{

	public void drive()

	{

		System.out.println("Reparing a car");

	}

}



public class Repairing {

	public static void main(String[] args)

	{

		car c1=new car();

		c1.drive();

		

	}



}

