
public class overview3 {
 void run () {
	 String name="shaik";
	 System.out.println(name);
 }
 }
class b1 extends overview3{
	void run() {
		String name="ABC";
		System.out.println(name);
	}
}
class test2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
overview3 b1=new b1();
b1.run();
	}

}
