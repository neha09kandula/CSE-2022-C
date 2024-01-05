package Cse5d0;
import java.util.Scanner;

public class multi_threading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        Number numberObj = new Number(number);
        Thread t1 = new Thread(numberObj);
        Thread t2 = new Thread(new EvenNumber(numberObj));
        Thread t3 = new Thread(new OddNumber(numberObj));
        t1.start();
        t2.start();
        t3.start();
    }
}

class Number implements Runnable {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Accessing number: " + number);
    }

    public int getNumber() {
        return number;
    }
}

class EvenNumber implements Runnable {
    private Number numberObj;

    public EvenNumber(Number numberObj) {
        this.numberObj = numberObj;
    }

    @Override
    public void run() {
        int number = numberObj.getNumber();
        if (number % 2 == 0) {
            System.out.println("Square of even number " + number + " is " + Math.pow(number, 2));
        }
    }
}

class OddNumber implements Runnable {
    private Number numberObj;

    public OddNumber(Number numberObj) {
        this.numberObj = numberObj;
    }

    @Override
    public void run() {
        int number = numberObj.getNumber();
        if (number % 2 != 0) {
            System.out.println("Cube of odd number " + number + " is " + Math.pow(number, 3));
        }
    }
}
