
package learning_java;


public class Threading extends Thread {
    public static void main(String[] args) {
        Threading Thread = new Threading();
        Thread.start();
        System.out.println("Thread is running inside");
    }
    public void run() {
        System.out.println("Thread is running outside");
    }

}
