package java_5e3;

public class Animal {
    public void display() {
        System.out.println("I am an animal");
    }

    class Dog extends Animal {
        @Override
        public void display() {
            System.out.println("I am a dog");
        }

        public void printMessage() {
            super.display();  // Using super to call the display() method from the superclass
        }
    }

    public static void main(String[] args) {
        Animal.Dog dl = new Animal().new Dog();
        dl.printMessage();
        dl.display();  // This calls the overridden display() method in the Dog class
    }
}

