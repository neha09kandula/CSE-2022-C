package programs;

class Vehicle
{
	public void drive()
	{
		System.out.println("Repairing a Vehicle");
	}
}
class car extends Vehicle
{
	public void drive()
	{
		System.out.println("Repairing a car");
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Vehicle c=new car();
			c.drive();
	}

}