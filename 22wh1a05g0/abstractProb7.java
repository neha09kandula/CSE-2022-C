package csec_5g0;

public class abstractProb7 {
	public static void main(String args[]) {
		Cats obj=new Cats();
		obj.cats();
		Dogs obj1=new Dogs();
		obj1.dogs();
	}
}
abstract class Animal{
	abstract void cats();
	abstract void dogs();
}
class Cats extends Animal{
	void cats() {
		System.out.println("Cats meow");
	}
}
class Dogs extends Animal{
	void dogs() {
		System.out.println("Dogs bark");
	}
}

