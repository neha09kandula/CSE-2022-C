package cse225i8;
public class Cse extends Thread {
	public static void main(String args []) {
		Cse t1=new Cse();
		t1.start();
		System.out.println(" thread is runnig inside ");
		
	}
  public void run() {
	  System.out.println(" thread is runnig outside");
  }
}
