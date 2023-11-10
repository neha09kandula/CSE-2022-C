package Java22wh1a05d0;
	import java.util.*;
	import java.lang.*;

	public class multilevel_inheritance {
		public static void main(String args[]) {
			BabyDog d = new BabyDog();
			d.weep();
	        d.bark();
	        d.eat();

	}
	}
	class Anima6{
		void eat() {
			System.out.println(" eating");
		}

	}
	class Do8 extends Anima6{
		void bark() {
			System.out.println("barking");
		}
		
	}
	class BabyDog extends Do8{
		void weep() {
			System.out.println(" weeping");
		}
	}


