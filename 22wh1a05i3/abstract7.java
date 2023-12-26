/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
abstract class Animals
{
    public void cats()
    {
        System.out.println("cats");
    }
    public void dogs()
    {
        System.out.println("dogs");
    }
}
class cats extends Animals
{
    public void cats()
    {
     System.out.println("cats meow");
    
}
}
class dogs extends Animals
{
    public void dogs()
    {
     System.out.println("dogs bark");
}
}
public class Main
{
	public static void main(String[] args) {
	    cats c=new cats();
	    c.cats();
	    dogs d=new dogs();
	    d.dogs();
	   
	}
}
