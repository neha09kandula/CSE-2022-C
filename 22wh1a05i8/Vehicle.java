package javaprograms;

public class Vehicle {
 void drive(){
	 System.out.println(" car driving");
 }	 
	 
 
class car extends Vehicle{
	void drive() {
		System.out.println(" Reparing a car");
	}
	
}

}
class Main{
	public static void main(String args []) {
		
		car obj=new car();
		
		obj.drive();
	}
}

