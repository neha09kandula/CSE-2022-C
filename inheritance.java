package csec2022;

public class inheritance {
	public void display() {
		System.out.println("iam an animal parent class");
	}
}
class subchild extends inheritance{
	public void display() {
		System.out.println("iam sub class");
	}
	public void message() {
		display();
}
public static void main(String[] args) {
	subchild d=new subchild();
	//display();
	super.display();
}
}
