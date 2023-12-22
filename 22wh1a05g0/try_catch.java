package csec_5g0;
public class try_catch {

	public static void main(String[] args) {
		int a=50;
		int b=0;
		try {
			int data=a/b;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		finally {
			System.out.println("rest of the code is exicuted");
		}

	}

}
		