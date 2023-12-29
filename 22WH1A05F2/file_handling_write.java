package cse_225f2;
import java.io.FileWriter;
import java.io.IOException;
public class file_handling_write {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try 
		{
			FileWriter Writer = new FileWriter("myfile.txt");
			Writer.write("Java is a good programming language");
			Writer.close();
			System.out.println("written in file");
		}
		catch (IOException e) 
		{
			System.out.println("Error");
			e.printStackTrace();
		}
	}
}