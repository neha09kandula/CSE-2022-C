abstract class Animals {
    public abstract void cats();
    public abstract void dogs();
}

class Cats extends Animals {
    public void cats() {
        System.out.println("Cats meow");
    }

    public void dogs() {
    }
}

class Dogs extends Animals {
    public void cats() {
    }

    public void dogs() {
        System.out.println("Dogs bark");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Cats myCat = new Cats();
        Dogs myDog = new Dogs();

        myCat.cats();
        myDog.dogs();
    }
}
