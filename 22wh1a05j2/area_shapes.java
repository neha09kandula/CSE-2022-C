package labinternal1;


interface area{
	int a=3;
	int b=6;
	void printarea();
}

class rectangle implements area{
	public void printarea(){
		System.out.println("area of rectangle is:"+a*b);
		
	}
}

class circle implements area{
	public void printarea(){
		System.out.println("area of circle is:"+3.14*a*a);
		
	}
}
class triangle implements area{
	public void printarea(){
		System.out.println("area of triangle is:"+0.5*a*b);
		
	}
}


public class area_shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r=new rectangle();
		r.printarea();
		circle c=new circle();
		c.printarea();
		triangle t=new triangle();
		t.printarea();
		

	}

}
