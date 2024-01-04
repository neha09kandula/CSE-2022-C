package vvvvvv;


/*4. (a)Write a Java program to create a class called Vehicle with a method called drive(). Create
a subclass called Car that overrides the drive() method to print "Repairing a car".*/
class vehicle{
   void drive()
   {
	   System.out.println("driving a car");
   }
   
public class CAR extends vehicle{
	 void drive()
	{
		System.out.println("Repairing a car");
	}
}
}
public class car {
    
	public static void main(String args[])
	{
		vehicle obj=new vehicle();
		obj.drive();
	}
	
	
}