package cse_c_;

class MyThread1 implements Runnable { 
    public void run() 
    { 
        for (int i = 0; i < 5; i++) { 
            System.out.println("suspend");      
            try { 
            	/*if(num%2==0) {
            		System.out.println(num+"the given number is even");
            		}*/
                Thread.sleep(1000); 
            } 
            catch (Exception e) { 
} 
        } 
    } 
} 
class MyThread1 implements Runnable {    
    public void run() 
    { 
        for (int i = 0; i < 5; i++) { 
            System.out.println("sleep");
            try { 
                Thread.sleep(1000); 
            } 
            	catch (Exception e) { 
            	} 
       } 
    }
}

public abstract class Threads {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = input.nextInt();
		if (num%2==0)
		{
		System.out.println(num+"the given number is even");
		}
		else{
		System.out.println(num+"the given number is odd");
		}
	}
}




