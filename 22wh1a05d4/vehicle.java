package cse225d4;

public class vehicle {
	public void drive() {
		System.out.println("car is working");

}
}
class car extends vehicle{
	public void drive() {
		System.out.println("Repairing a car");
		
	}
}
class main{
	public static void main(String[] args) {
		car obj=new car();
		obj.drive();
	}
}

