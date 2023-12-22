package inheritance;

abstract class Animals {
    public abstract void makeSound();
}

class Cats extends Animals {
    public void makeSound() {
        System.out.println("Cats meow");
    }
}

class Dogs extends Animals {
    public void makeSound() {
        System.out.println("Dogs bark");
    }
}

public class inheritance1{
    public static void main(String args[]) 
    {
        Cats cat = new Cats();
        Dogs dog = new Dogs();

        cat.makeSound();
        dog.makeSound();
    }
}

