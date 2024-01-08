package newproject;
public class quest1 extends Thread {
	    public void run() {
	        try {
	            Thread.sleep(300);
	            System.out.println("Run method executed by thread");
	        } catch (InterruptedException ie) {
	            // Handle interrupted exception if needed
	        }
	    }

	    public static void main(String[] args) {
	        quest1 t1 = new quest1();
	        System.out.println("Before starting thread isAlive: " + t1.isAlive());
	        t1.start();
	        System.out.println("After starting thread isAlive: " + t1.isAlive());
	    }
	}

