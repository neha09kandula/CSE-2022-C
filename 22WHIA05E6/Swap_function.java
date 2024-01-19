package practice_problems;

public class Swap_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		swapfunction(a,b);

	}
	public static void swapfunction(int a,int b) {
		System.out.println("original values- a:"+a+",b:"+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("duplicate values- a:"+a+",b:"+b);
	}

}
