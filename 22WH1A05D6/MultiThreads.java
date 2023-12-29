import java.io.IOException;
import java.util.Random;

class NumberGenerator extends Thread{
	boolean stop=false;
	NumberGenerator(){
		Random rand=new Random();
		int k=rand.nextInt()%20;
		for(int i=0;i<k;i++) {
			int num=i;
			System.out.println("Number Generated : "+num);
			try {
				if(num%2==0) {
					EvenNumber e=new EvenNumber(num);
					Thread t1=new Thread(e);
					t1.start();
				}
				else {
					OddNumber o=new OddNumber(num);
					Thread t2=new Thread(o);
					t2.start();	
				}
				Thread.sleep(1000); 
			}
			catch(InterruptedException ie) {
				System.out.println(ie);
			}
		}
	}
}

class OddNumber extends Thread{
	int num;
	OddNumber(int i){
		num=i;
	}
	public void run() {
			int req=num*num*num;
			System.out.println("It is an odd number."+req+"\n");
	}
}

class EvenNumber extends Thread{
	int num;
	EvenNumber(int i){
		num=i;
	}
	public void run() {
			int req=num*num;
			System.out.println("It is an even number."+req+"\n");
	}
}

public class MultiThreads {
	public static void main(String args[]) {
		NumberGenerator ng=new NumberGenerator();
	}
}
