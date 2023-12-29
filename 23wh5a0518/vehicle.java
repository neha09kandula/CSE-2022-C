package java_programs;
class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}
public class vehicle {
	public static void main(String[] args) {
        Vehicle myVehicle = new Car();
        myVehicle.drive();
    }

}
