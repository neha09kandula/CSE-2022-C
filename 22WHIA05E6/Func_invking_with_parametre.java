package practice_problems;

public class Func_invking_with_parametre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Func_invking_with_parametre obj=new Func_invking_with_parametre();
		
		int a=10;
		int b=20;
		int result=obj.add(a, b);
		System.out.println(result);

	}
	public int add(int a,int b) {
		return a+b;
	}

}
