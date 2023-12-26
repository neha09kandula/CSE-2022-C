package javaprogram;
class Vehicle {
 public void drive() {
     System.out.println("Drive vehicle");
 }
}

class Car extends Vehicle {
 public void drive() {
     System.out.println("Repairing a car");
 }
}

public class override{
 public static void main(String[] args) {
         Car obj = new Car();
         obj.drive();
 }
}
