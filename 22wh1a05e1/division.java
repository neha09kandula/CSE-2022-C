import java.util.*;
 class divide{
    public static void main(String[] args)
    {
       
            System.out.println("disible by five:");
	    Scanner input=new Scanner(System.in);
            System.out.println("Enter the number:");
            int num=input.nextInt();
	    if(num % 5==0)
		System.out.println("Divisible by 5");
	    else
		System.out.println("Not divisible by 5");
          }
    }