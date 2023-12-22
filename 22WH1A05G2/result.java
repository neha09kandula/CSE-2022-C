package cse225g2_lab_internal_1;

class vehicle{
	void drive() {
		System.out.println("Repairing a vehicle...");
	}
}

class car extends vehicle{
	void drive() {
		System.out.println("Repairing a car...");
	}
}

public class result {
	public static void main(String args[]) {
		car obj = new car();
		obj.drive();
	}
}
