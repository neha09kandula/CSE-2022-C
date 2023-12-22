package labinternal;

abstract class Animal {
      abstract void cat();
      
}
class bark extends Animal{
	
	void cat()
	{
		System.out.println("Meow");
	}
}
  
class meow extends Animal{
	void cat()
	{
		System.out.println("DOGG");
	}
}
 class main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      bark obj = new bark();
      obj.cat();
      
      meow obj2 = new meow();
      obj2.cat();
      
	}

	}

