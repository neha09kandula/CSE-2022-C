import java.util.*;
class main{
    public static void main(String args[])
    {
        System.out.println("divisibility of five");
	Scanner input=new Scanner(System.in);
	System.out.println("enter the number:");
	int num=input.nextInt();

	if(num % 5==0)
		System.out.println("yes");
	else
		System.out.println("no");
     }
}