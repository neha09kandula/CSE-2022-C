class Animal {
   public void makeSound() {
      System.out.println("Animal makes a sound");
   }
}

class Dog extends Animal {
   public void makeSound() {
      System.out.println("Dog barks");
   }
}

class Cat extends Animal {
   public void makeSound() {
      System.out.println("Cat meows");
   }
}

class Polymorphism {
   public static void main(String[] args) {
       
      // Both animal1 and animal2 are of type Animal,
      // but they refer to objects of their respective subclass types Dog and Cat.
      Animal animal1 = new Dog();
      Animal animal2 = new Cat();

      animal1.makeSound(); // Output: Dog barks, because it refers to a Dog object.
      animal2.makeSound(); // Output: Cat meows, because it refers to a Cat object.
   }
}
