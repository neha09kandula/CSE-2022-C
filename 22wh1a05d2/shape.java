package internal;

public class shape {
	interface shapes {
		void printArea();
		int a,b ;
		void printArea();
		}
class rectangle implements shapes {
	void printArea(int a,int b) {
		System.out.println(a*b);
	}
	}

class triangle implements shapes {	
	void printArea(int a,int b) {
		System.out.println(1/2*a*b);
		}
	}

 
class circle implements shapes {
	void printArea(int a,int b) {
		System.out.println(3.14*b*b);
		}
		}

public static void main(String[] args) {
	System.out.println("Enter the value of a :");
	System.out.println("Enter the value of b :");
	}
}


