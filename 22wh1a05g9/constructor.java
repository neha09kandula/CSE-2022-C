public class constructor{
	int x;
	public constructor(int y)
{
	x=10;
	y=x;
}
public static void constructor(String args[]){
	constructor var = new constructor();
	System.out.println(var.y);
}
}