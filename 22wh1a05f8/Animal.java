package my_java_projects;

/*7.Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. Now create a
class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method
'dogs' which prints "Dogs bark", both inheriting the class 'Animals'. Now create an object
for each of the subclasses and call their respective methods.*/

abstract class Animals
{
		abstract void cats();
		abstract void dogs();
		
}
class Cats extends Animal
	{
		public void cats() 
		{
			System.out.println("Cats meow");
		}
	}
class Dogs extends Animal
	{
		public void dogs() 
		{
			System.out.println("Dogs bark");
		}
	}

	public class Animal 
	{
		public static void main(String[] args)
		{
			Cats obj1=new Cats();
			Dogs obj2=new Dogs();
			obj1.cats();
			obj2.dogs();
		}
	}
