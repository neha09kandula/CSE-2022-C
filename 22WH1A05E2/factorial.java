import java.util.*;
class numb{
    public static void main(String args[])
    {
        System.out.println("Number is factorial of:");
	Scanner input=new Scanner(System.in);
	System.out.println("enter the number:");
	int num=input.nextInt();
	
	int i,fact=1;     
	for(i=1;i<=num;i++)
	{    
		fact=fact*i;
			System.out.println("Factorial of " +num+ " is: "+fact);	
     }
		 
}
}