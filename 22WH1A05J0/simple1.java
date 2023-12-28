package priyanka;

/*4. (a)Write a Java program to create a class called Vehicle with a method called drive(). Create
a subclass called Car that overrides the drive() method to print "Repairing a car".*/
class Vehicle {
    void drive() {
        System.out.println("Driving a car");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class simple1 {
    public static void main(String args[]) {
        Car obj = new Car();
        obj.drive();

        Vehicle obj1 = new Vehicle();
        obj1.drive();
    }
}
