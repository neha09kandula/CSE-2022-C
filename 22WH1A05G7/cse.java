package cse225g7;

public class cse extends Thread{

	public static void main(String[] args) {
			// TODO Auto-generated constructor stub
		Thread t = new Thread();
		t.start();
		System.out.println("thread is running inside");
		}
		public void run() {
				System.out.println("thread is running outside");
			}
		}
