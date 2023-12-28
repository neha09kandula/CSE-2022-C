package labinternal1;

class vehicle{
	public void drive() {
		System.out.println("super class drive");
	}
}
class b extends vehicle{
	public void drive() {
		System.out.println("Repairing car");
		
	}
}
public class override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b obj=new b();
		obj.drive();

	}

}
