package javaprogrames;

public class A implements Runnable{
	A(){
		Thread t= new Thread();
		t.start();
	}
public static void main(String[] args) {
		
	}
public void run() {
	// TODO Auto-generated method stub
	new A();
}

}
