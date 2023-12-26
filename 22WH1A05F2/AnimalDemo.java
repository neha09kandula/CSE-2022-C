public class AnimalDemo {
    public static void main(String[] args) {
        Cats myCat = new Cats();
        Dogs myDog = new Dogs();
        myCat.cats(); 
        myDog.dogs(); 
    }
}
abstract class Animals {
    abstract void cats();
    abstract void dogs();
}
class Cats extends Animals {
    void cats() {
        System.out.println("Cats meow");
    }
    void dogs() {
    }
}
class Dogs extends Animals {
    void dogs() {
        System.out.println("Dogs bark");
    }
    void cats() {
    }
}