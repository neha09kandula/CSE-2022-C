package javaprograms;
//single inheritance
 public class Animal{
	public static void main (String args[])
	{
		
		Dog dg  = new Dog();
		dg.colour="brown";
		dg.typefood="milk";
		dg.bread="shepard" ;
		dg.method1();
		dg.method2();
		System.out.print(" colour is "   +  dg.colour);
		System.out.print(" ");
		System.out.print(" bread is "  +   dg.bread);
		System.out.print(" ");
		System.out.print(" typefood is "  +   dg.typefood);
	}

}
class Animal1{
	String colour;
	String typefood;
	void method1()
	{
		System.out.println("in super calss");
	}
}
class Dog extends Animal1{
	String bread;
	void method2()
	{
		System.out.println("in sub calss");
	}
	
}