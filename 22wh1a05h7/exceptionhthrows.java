package programs;
import java.io.IOException;
import java.util.*; 
public class exceptionhthrows {
	public void method(String a) throws IOException
	{
		if(a.length()<10)
			throw new IOException("Your password is not valid");
		else
			System.out.print("Password is valid");
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the password : ");
		String pw=in.nextLine();
		exceptionhthrows o=new exceptionhthrows();
		o.method(pw);
		in.close();
		
	}

}
