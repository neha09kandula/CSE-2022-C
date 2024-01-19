package practice_problems;

public class Metod_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x=10;
		 int y=20;
		 int r=3;
		 Metod_overloading obj=new Metod_overloading();
		 float area_circle=obj.area(r);
		 int area_rectangle=obj.area(x,y);
		 System.out.println(area_circle);
		 System.out.println(area_rectangle);

	}
	public float area(int n) {
		float result=3.14f*n*n;
		return result;
	}
	public int area(int n1,int n2) {
		int result=n1*n2;
		return result;
	}

}
