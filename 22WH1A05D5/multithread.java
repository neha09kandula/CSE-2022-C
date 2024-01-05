package frames;

import java.util.Random;
import java.util.random.RandomGenerator;

class RandomNumberThread extends Thread {
    public void run() {
        Thread random = new Thread();
        while (true) {
            int randomNumber =  random.nextInt(1000); 
            System.out.println("Random Number: " + randomNumber);

            if (randomNumber % 2 == 0) {
               
                Thread squareThread = new Thread(new SquareThread(randomNumber));
                squareThread.start();
            } else {
              
                Thread cubeThread = new Thread(new CubeThread(randomNumber));
                cubeThread.start();
            }

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquareThread implements Runnable {
    private int number;

    public SquareThread(int number) {
        this.number = number;
    }
    public void run() {
        System.out.println("Square: " + (number * number));
    }
}

class CubeThread implements Runnable {
    private int number;

    public CubeThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Cube: " + (number * number * number));
    }
}

public class multithread {
    public static void main(String[] args) {
        Thread randomThread = new RandomNumberThread();
        randomThread.start();
    }
}
