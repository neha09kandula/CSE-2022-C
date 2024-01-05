package cse225f1;
import java.util.Random;

class multithreading extends Thread {
    private Random random = new Random();
    private int generatedNumber;

    public void run() {
        // Generate a random number between 1 and 10
        generatedNumber = random.nextInt(10) + 1;
        System.out.println("Thread 1 - Generated Number: " + generatedNumber);

        // Determine if the number is even or odd and start the corresponding thread
        if (generatedNumber % 2 == 0) {
            new EvenThread(generatedNumber).start();
        } else {
            new OddThread(generatedNumber).start();
        }
    }
}

class EvenThread extends Thread {
    private int number;

    public EvenThread(int number) {
        this.number = number;
    }

    public void run() {
        int square = number * number;
        System.out.println("Thread 2 - Square of " + number + ": " + square);
    }
}

class OddThread extends Thread {
    private int number;

    public OddThread(int number) {
        this.number = number;
    }

    public void run() {
        int cube = number * number * number;
        System.out.println("Thread 3 - Cube of " + number + ": " + cube);
    }
}

public class main {
    public static void main(String[] args) {
        // Create an instance of the NumberGenerator thread and start it
        new multithreading().start();
    }
}
}

