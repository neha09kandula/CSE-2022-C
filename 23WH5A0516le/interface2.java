interface drawable {
void draw();
}
class circle implements drawable{
	public void draw() {
		System.out.println("circle is drawn");
	}
}
class rectangle implements drawable{
	public void draw() {
	System.out.println("rectangle is drawn");	
	}
	}
	class test6{
		public static void main(String []args) {
drawable r1=new rectangle();
drawable r2=new circle();
r1.draw();
r2.draw();
	}
	}
