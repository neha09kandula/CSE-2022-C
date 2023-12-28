package labinternal1;
import java.util.*;
class area2{
	int width,length;
	float radius;
	public void carea(float radius) {
		this.radius=radius;
		System.out.printf("the area of circle with radius is %f is %f\n",radius,3.14*radius*radius);
	}
	public void rarea(int width,int length) {
		this.width=width;
		this.length=length;
		System.out.printf("the area of rectangle with sides %d and %d is : %d\n",width,length,width*length);
	}
}

public class method_ovverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float r=sc.nextFloat();
		int w=sc.nextInt();
		int l=sc.nextInt();
		area2 a=new area2();
		a.carea(r);
		a.rarea(w, l);
		
		

	}

}
