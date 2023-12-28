package csec;
	abstract class Main{
	    // Abstract methods
	    abstract void cats();
	    abstract void dogs();
	}
	class Cats extends Animals {
	    void cats() {
	        System.out.println("Cats meow");
	    }
	    void dogs() {
	    }
	}
	class Dogs extends Animals {
	    void cats() {
	    }
	    void dogs() {
	        System.out.println("Dogs bark");
	    }
	}
	public class Animals {
	    public static void main(String[] args) {
	        Cats myCat = new Cats();
	        myCat.cats();
	        Dogs myDog = new Dogs();
	        myDog.dogs();
	    }
	}