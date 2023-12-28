package priyanka;
/*2. Write a java program to create an interface named Shape that contains two integers and an
empty method named printArea (). Provide three classes named Rectangle, Triangle and
Circle such that each one of the classes implements the class Shape. Each one of the classes
contains only the method printArea () that prints the area of the given shape&*/
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

