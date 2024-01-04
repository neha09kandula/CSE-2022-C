package abstraction;

public class overview2 {
	void run() {
		String name="ameena";
		System.out.println(name);
	}
	}
class b1 extends overview2{
	void run() {
		String name="shaik";
		System.out.println(name);
	}
	}
class test2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
overview2 n1=new b1();
n1.run();
	}

}
