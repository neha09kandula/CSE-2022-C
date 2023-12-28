package priyanka;

/*4. (a)Write a Java program to create a class called Vehicle with a method called drive(). Create
a subclass called Car that overrides the drive() method to print "Repairing a car".*/
public class Vehicle{
   void drive()
   {
	   System.out.println("driving a car");
   }
   
public class Car extends Vehicle{
	 void drive()
	{
		System.out.println("Repairing a car");
	}
}
}
public class Main {
    
	public static void main(String args[])
	{
		Car obj=new Car();
		obj.drive();
	}
	
	
}
