package priyanka5j0;

public class Exception_Handling_Finally {
  public static void main(String args[])
  {
	  int a[]=new int[3];
	  a[0]=20;
	  a[1]=30;
	  a[2]=40;
	  try
	  {
		System.out.println("element in the array of index"+a[4]);  
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);  
	  }
	  finally
	  {
		  System.out.println("element in the array of index 0 is "+a[0]);
		  System.out.println("element in the array of index 1 is "+a[1]);
		 
	  }
	  
  }
}
