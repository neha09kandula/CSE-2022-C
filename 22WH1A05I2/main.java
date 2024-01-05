package cse5i2;


public class main {
	class A implements Runnable
	{
		A(){
			Thread t=new Thread(new Thread());
			t.start();
			
		}
	
		public void main(String args[])
		{
			System.out.println("Thread!");
		}
		
		public void run()
		{
			new A();
		}
		
	}

	
}
