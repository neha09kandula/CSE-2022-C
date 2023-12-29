package labprograms;
import java.util.*;
public class main {
	    
	
	    public static void main(String[] args) {
	        Cat myCat = new Cat();
	        Dog myDog = new Dog();

	        myCat.cats();
	        myDog.dogs();
	    }
	}

	abstract class Animals {
	    abstract void cats();
	    abstract void dogs();
	}

	class Cat extends Animals {
	    void cats() {
	        System.out.println("Cats meow");
	    }
	}

	class Dog extends Animals {
	    void dogs() {
	        System.out.println("Dogs bark");
	    }
	}



