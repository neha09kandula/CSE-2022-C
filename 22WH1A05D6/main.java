package cseb;

class vehicle {
	public void drive() {
		System.out.println("car is working");
	}
}
class car extends vehicle{
	public void drive() {
		System.out.println("reparing a car");
	}
}
class main{
	public static void main(String[] args) {
		car obj=new car();
		obj.drive();
	}
}