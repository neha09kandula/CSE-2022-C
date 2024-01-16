package java_5e3;

interface MyInterface {
 void display(); 
}

class MyClass implements MyInterface {
 public void display() {
     System.out.println("Implementation of display method in MyClass");
 }
 public void additionalMethod() {
     System.out.println("This is an additional method in MyClass");
 }
}

public class InterfaceExample {
 public static void main(String[] args) {
     // Create an object of MyClass
     MyClass myObject = new MyClass();

     // Call the display method from the interface
     myObject.display();

     // Call an additional method specific to MyClass
     myObject.additionalMethod();
 }
}
