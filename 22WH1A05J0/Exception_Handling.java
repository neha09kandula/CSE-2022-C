package priyanka5j0;
public class Exception_Handling {
    public static void main(String args[])
    {
    	int a=10,b=5,c=5;
    	try
    	{
    		int d=a/(b-c);
    		System.out.println(d);
    		
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    	int x=a/(b+c);
    	System.out.println("x value is "+x);
    }
}
