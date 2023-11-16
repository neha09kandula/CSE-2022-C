

class Animal
{
	public void display(){
		System.out.println("i can sleep");
		}
}
class Dog extends Animal{
@Override
	 public void display() {
		System.out.println("i can walk");
		}

 	 void printmessage(){
		display();
	}
}
public class main{
	public static void main(String args[])
	{
	Dog ob1=new Dog();
	ob1.printmessage();
	}
}