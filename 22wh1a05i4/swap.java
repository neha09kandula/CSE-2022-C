public class swap {
  public static void main(String args[])
   {
	float first=1.20f , second=2.30f;
	System.out.println("__Before swapping__");
	System.out.println("First number = " + first);
	System.out.println("Second number = " + second);
	float temp=first;
     	      first=second;
      	      second=temp;
	System.out.println("__After swapping__");
	System.out.println("First number = " + first);
	System.out.println("Second number = " + second);
   }
}