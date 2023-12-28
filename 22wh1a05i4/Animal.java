package javaprograms;

public class Animal {
	void cats() {
		 System.out.println("y");
	 }
	 void dogs() {
		 System.out.println("x");
	 }
	}
	class Cats extends Animal{
		void cats() {
			System.out.println(" cats Meow");
		}
		
	}
	class Dogs extends Animal{
	   void dogs() {
		   System.out.println("Dogs Bark");
	   }
	   
	}
	class Demo{
		public static void main(String args[]) {
		Animal d=new Dogs();
		Animal c=new Cats();
		d.dogs();
		c.cats();
		}

}
