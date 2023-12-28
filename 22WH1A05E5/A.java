abstract public class Animals {
 void cats() {
	 System.out.println(" ");
 }
 void dogs() {
	 System.out.println(" ");
 }
}
class Cats extends Animals{
	void cats() {
		System.out.println(" Meow");
	}

}
class Dogs extends Animals{
   void dogs() {
	   System.out.println("Bark");
   }

}
class A{
	public static void main(String args[]) {
	Animals d=new Dogs();
	Animals c=new Cats();
	d.dogs();
	c.cats();
	}
}
