package vvvvvv;

/*7. Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. Now create a
class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method
'dogs' which prints "Dogs bark", both inheriting the class 'Animals'. Now create an object
for each of the subclasses and call their respective methods.*/

abstract class Animals {
	abstract void cats();
	abstract void dogs();
}
 class Cats extends Animals
       {   
	      
    	   void cats()
    	   {
    	   System.out.println("Cats meow");
           }

		@Override
		void dogs() {
			// TODO Auto-generated method stub
			
		}
       }
class Dogs extends Animals
     {   
         void dogs()
       {
    	   System.out.println("Dogs bark");
       }

		@Override
		void cats() {
			// TODO Auto-generated method stub
			
		}
        
  }

public class dc {
	public static void main(String args[])
	{
		Cats obj=new Cats();
		obj.cats();
		Dogs obj1=new Dogs();
		obj1.dogs();
	}
}