public class swapNumbers {
  public static void main(String args[])
   {
	float first=1.20f , second=2.30f;
	System.out.println("__Before swap__");
	System.out.println("First number = " + first);
	System.out.println("Second number = " + second);
	      first=first-second;
     	      second=first+second;
      	      first=second-first;
	System.out.println("__After swap__");
	System.out.println("First number = " + first);
	System.out.println("Second number = " + second);
   }
}