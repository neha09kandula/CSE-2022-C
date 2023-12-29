package cse225i9;
import java.io.IOException;
public class Throws_keyword {
	void m() throws IOException
	{
		throw new IOException("Device Error");
	}
	void n() throws IOException
	{
		m();
	}
	void p()
	{
		 try
		 {
			 n();
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception Handled");
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throws_keyword obj= new Throws_keyword();
		obj.p();
		System.out.println("Normal Flow");
	}

}
