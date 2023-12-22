package inheritance;

	interface A {
	    void methodA();
	}
	interface B {
	    void methodB();
	}
	class MyClass implements A, B {
	    public void methodA() {
	        System.out.println("Method A");
	    }

	    public void methodB() {
	        System.out.println("Method B");
	    }
	    public void myClassMethod() {
	        System.out.println("MyClass Method");
	    }
	}

	public class file {
	    public static void inheritance(String args[]) 
	    {
	        
	        MyClass myObject = new MyClass();

	      
	        myObject.methodA();
	        myObject.methodB();

	        myObject.myClassMethod();
	    }
	}


}
