 class details
{
public static void main(String args[])
{
	System.out.println("student details");
	Scanner input=new Scanner(System.in);
	System.out.println("enter the name:");
	string name=input.nextLine();
	System.out.println("my name is :"+name);
	System.out.println("enter the age:");
	int age=input.nextInt();
	System.out.println("my age is:"+age);
	input.close();
}
}