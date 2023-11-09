package javaprograms;

public class hirarchical_inher {
public static void main(String args[]) {
	
	Cat c= new Cat();
	c.eat();
	c.meow();
	
	Dog3 d=new Dog3();
	d.eat();
	d.bark();
}
}
class Animal6{
	
	void eat()
	{
		System.out.println("Animal is eating");
	}
	
	

}
class Cat extends Animal6{
	
	void meow()
	{
		System.out.println("cat is meowing..");
	}
}
class Dog3 extends Animal6{
	
	void bark()
	{
		System.out.println("Dog is barking...");
	}
}
