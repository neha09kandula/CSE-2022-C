package cse225i8;


public class Myclass implements Runnable {
	  public void run() {
		    try {
		      // code that might throw an InterruptedException
		      Thread.sleep(1000);
		    } catch (InterruptedException e) {
		      System.out.println("MyThread was interrupted!");
		    }
		  }
		}

class Main {
  public static void main(String[] args) {
    Myclass myThread = new Myclass();
    Thread thread = new Thread(myThread);
    thread.start();
    thread.interrupt();
  }
}