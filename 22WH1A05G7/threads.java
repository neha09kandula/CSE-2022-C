package cse225g7;

	class threads implements Runnable {
	    @Override
	    public void run() {
	        try {
	            System.out.println("Thread is going to sleep.");
	            Thread.sleep(5000);
	            System.out.println("Thread woke up.");
	        } catch (InterruptedException e) {
	            System.out.println("Thread caught InterruptedException. ");
	        }
	    }
    public static void main(String[] args) {
	        Thread t2 = new Thread(new threads());
	        t2.start();
	  }
}
