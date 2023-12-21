class Animal {
  public void eat() {
    System.out.println("Animal is eating.");
  }
  
  public void sleep() {
    System.out.println("Animal is sleeping.");
  }
}

class Dog extends Animal {
  public void bark() {
    System.out.println("Dog is barking.");
  }
  
  public void breed() {
    System.out.println("Dog is breeding.");
  }
}

class Codechef {
   public static void main(String[] args) {
      Dog dog1 = new Dog();

      // The eat method is from the Animal class inherited to the Dog class
      // This way you can use the methods of Animal class without having to create an instance of Animal class
      dog1.eat(); 
      dog1.bark();
   }
}
