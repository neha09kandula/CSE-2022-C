package cse_c;

//public class vehicle_repair {
class vehicle_repair {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends vehicle_repair {
    void drive() {
        System.out.println("Repairing a car");
    }


//public class Main {
    public static void main(String[] args) {
        vehicle_repair vehicle = new vehicle_repair();
        vehicle.drive();

        Car car = new Car();
        car.drive();
    }
}
