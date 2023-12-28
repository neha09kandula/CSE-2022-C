package framework;

		abstract class Animals {
		abstract void cats();
		abstract void dogs();
		}

		class Cats extends Animals {
		public void cats() {
		System.out.println("Cats meow");
		}
		public void dogs() {
		}
		}

		class Dogs extends Animals {
		public void dogs() {
		System.out.println("Dogs bark");
		}
		public void cats() {
		}
		}

		public class Internal7 {
		public static void main(String[] args) {
		Cats myCat = new Cats();
		myCat.cats();

		Dogs myDog = new Dogs();
		myDog.dogs();
		}
		}
	

}
