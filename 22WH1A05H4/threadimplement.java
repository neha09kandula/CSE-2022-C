package javaprogrames;

public class Main extends Thread {
public static void main(String[] args) {
	Main t= new Main();
	t.start();
    System.out.println("Thread is running inside");
}
public void run() {
	System.out.println("Thread is running outside");
}

}
