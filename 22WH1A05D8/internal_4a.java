package farhana;
class Vehicle {
 public void drive() {
     System.out.println("Driving the vehicle");
 }
}

class Car extends Vehicle {
 public void drive() {
     System.out.println("Repairing a car");
 }
}

public class internal_4a{
 public static void main(String[] args) {
     //Vehicle vehicle = new Vehicle();
     //vehicle.drive();
     Car car = new Car();
     car.drive();
 }
}

