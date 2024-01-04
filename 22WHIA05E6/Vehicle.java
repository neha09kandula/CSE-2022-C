package java_internal_questions;

public class Vehicle {
	public void drive() {
		System.out.println("Repairing a Vehicle");
		
	}
 public static class car extends Vehicle{
	// public car() {
	// System.out.println("Repairing a car");
// }
 //override
	    public void drive() {
		System.out.println("repairing a car");
		
	}
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car obj=new car();
		obj.drive();

	}


}
