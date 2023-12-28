package lab_questions;

import java.util.Scanner;

class Vehicle
{
	public void drive()
	{
		System.out.println("Driving a vehicle");
	}
}
class Car extends Vehicle
{
 @Override
 	public void drive()
 	{
     	System.out.println("Repairing a car");
 	}
}


public class VehicleTest
{
	public static void main(String[] args)
 	{
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter '1' to drive a vehicle, '2' to repair a car:");
	     int userChoice = sc.nextInt();
	     Vehicle vehicle = new Vehicle();
	     Car car = new Car();
	     if (userChoice == 1)
	     {
	    	 vehicle.drive();
	     }
	     else if (userChoice == 2)
	     {
	    	 car.drive();
	     }   	 
	     else
	     {
	    	 System.out.println("Invalid choice");
	     } 
 	}
}
