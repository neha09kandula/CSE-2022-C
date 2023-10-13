public class parameter{
	public int parameter(int x, int y)
{
	return x-y;
}
public static void main(String args[]){
	parameter obj = new parameter();
	System.out.println(obj.parameter(12,9));
}
}