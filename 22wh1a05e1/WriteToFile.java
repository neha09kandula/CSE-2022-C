package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile 
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter Writer = new FileWriter("my file.txt");
			Writer.write("File is a large");
			Writer.close();
			System.out.println("Successfully written.");
		}
		catch (IOException  e)
		{
			System.out.println("File doesn't exist.");
		}
	}
}
