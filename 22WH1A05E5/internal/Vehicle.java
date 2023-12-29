package swathi;

public class Vehicle {
	public void drive() {
		System.out.println("This is the drive method");
	}
	public void drive(String s) {
		System.out.println(s);
	}
	public static void main(String [] args) {
		Vehicle obj = new Vehicle();
		obj.drive("Reparing a car");
	}
}
