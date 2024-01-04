package programs;
abstract class Animals
{
	abstract void cats();
	abstract void dogs();
}
class Cats extends Animals
{
	public void cats()
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
	public void dogs()
	{
		System.out.println("Dogs bark");
	}

	@Override
	void cats() {
		// TODO Auto-generated method stub
		
	}
}
public class abstract_animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals c=new Cats();
		Animals d=new Dogs();
		c.cats();
		d.dogs();
	}

}