package csec2022;

class inheritance {
	public void display()
	System.out.println("i am meghana");
}
class name extends inheritance {
	public void display()
	System.out.println("meghana");
	}
public void printmessage()
   display();
 public class main() 
{
	public static void main(String[args]) {
		name m1=new name();
		display();
		super.display();
		
	}
}